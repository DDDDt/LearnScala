package com.learn.future


import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
/**
  * @author dt 2019/1/31 10:32
  */
class FutureCompositionLearn {

  def futureMap(): Unit ={

    val getA = Future{
      println("getA 线程进入....")
      Thread.sleep(100)
      "dttt"
    }

    // 在一个线程中调用另外一个线程
    /* getA onComplete{
       case Success(value) =>
         val getB = Future{
           println(s"线程内.....$value")
           Thread.sleep(100)
           "dddddd"
         }
         getB onComplete{
           case Success(value) => println(value)
           case Failure(e) => e.printStackTrace()
         }
         Thread.sleep(1000)
       case Failure(e) => e.printStackTrace()
     }*/


    // 使用组合器 map
    val getB = getA map {
      a =>
        println(s"线程内.....$a")
        Thread.sleep(100)
        throw new Exception("手动报错")
        "dddddd"
    }

    getB onComplete{
      case Success(value) => println(value)
      case Failure(e) => e.printStackTrace()
    }

    Thread.sleep(1000)

  }

  // future for
  def futureFor(): Unit ={

    val testA = Future{
      println("testA")
      Thread.sleep(100)
      "testA"
    }

    val testB = Future{
      println("testB")
      Thread.sleep(100)
      "testB"
    }

    val c = for{
      a <- testA
      b <- testB
    } yield a+b

    c onComplete{
      case Success(value) => println(value)
      case Failure(e) => println(e)
    }

    Thread.sleep(1000)

  }

  // flatmap
  def futureFlatMap(): Unit ={

    val testA = Future{
      println("flatMap ->testA")
      Thread.sleep(100)
      "flatMapTestA"
    }

    val testB = Future{
      println("flatMap -> testB")
      Thread.sleep(100)
      "flatMapTestB"
    }

    testA flatMap{
      a =>
        testB.map(b => println(a + b))
    }

  }

  // 使用recover
  def futureRecover(): Unit ={

    val getA = Future{
      println("recover getA 线程进入....")
      Thread.sleep(100)
      "recover dttt"
    }

    val getB = getA map {
      a =>
        println(s"recover 线程内.....$a")
        Thread.sleep(100)
        throw new Exception("recover 手动报错")
        "recover dddddd"
    }recover{
      case e: Exception =>
        e.printStackTrace()
        "recover 0"
    }

    getB onComplete{
      case Success(value) => println(value)
      case Failure(e) => e.printStackTrace()
    }

    Thread.sleep(1000)

  }

  // 使用 fallbackTo
  def futureFallBackTo(): Unit ={

    val getA = Future{
      println("fallBack getA 线程进入....")
      Thread.sleep(100)
      "fallBack getA"
    }.map(a => s"$a -> map")

    val getB = Future{
      println("fallBack getB 线程进入....")
      Thread.sleep(100)
      "fallBack getB"
    }.map(b => s"$b -> map")

    val aOrb = getA fallbackTo getB

    aOrb onComplete{
      case Success(value) => println(value)
      case Failure(e) => e.printStackTrace()
    }

    Thread.sleep(1000)

  }

  // andThen
  def futureAndThen(): Unit = Future{
    println("andThen ...")
    Thread.sleep(100)
    "andthen 第一步完成"
  } andThen{
    case Success(value) => println(value)
  } andThen{
    case _ => println("andThen 结束 ...")
  }

  // 投影
  def futureProjecttions(): Unit ={

    val f = Future{
      2 / 0
    }
    for (e <- f.failed) println(e)

    Thread.sleep(1000)

  }

  // blocking
  def futureBlock(): Unit = blocking {

    val getA = Future{
      println("getA 线程进入....")
      Thread.sleep(100)
      "blocking"
    }

    getA onComplete{
      case Success(value) => println(value)
      case Failure(e) => e.printStackTrace()
    }

  }

  // promises
  def futurePromises(): Unit ={

    val p = Promise[String]()
    val f = p.future

    // 生产者
    val producer = Future{
      // 生产者
      val product = "1"
      p success product
    }

    // 消费者
    val consumer = Future{
      f onComplete{
        case Success(value) => println(value)
        case Failure(e) => e.printStackTrace()
      }
    }

    Thread.sleep(1000)

//    p success "结束"

    println("promise 结束")

  }

}

object TestFutureCompositionLearn extends App{

  val future = new FutureCompositionLearn()

  // map
  println("map -> ...")
  future futureMap()

  // for
  println("for -> ...")
  future futureFor()

  // flatMap
  println("flatmap -> ...")
  future futureFlatMap()

  println("recover -> ...")
  future futureRecover()

  println("futureFallBackTo -> ...")
  future futureFallBackTo()

  println("andthen -> ...")
  future.futureAndThen()
  Thread.sleep(3000)

  println("解构 -> ...")
  future futureProjecttions()

  println("blocking -> ...")
  future futureBlock()

  println("promise -> ...")
  future futurePromises()
}