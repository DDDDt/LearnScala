package com.learn.akka.simpleIntroduction

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Random, Success}
/**
  * @author dt 2019/1/30 13:22
  */
class FuturesScala {

  def runAlgorithm(i: Int): Future[Int] = Future{
    Thread.sleep(Random.nextInt(500))
    val result = 1 + 10
    println(s"返回值为: $result")
    result
  }

}

object TestFuturesScala extends App{

  implicit val baseTime = System.currentTimeMillis()

  val f = Future{
    Thread.sleep(500)
    1+1
  }

  // 等待返回数据，只等待 1s, 超过 1s 没有返回会抛出 java.util.concurrent.TimeoutException 异常
  val result = Await.result(f,1 second)

  println(result)

  println("结束。。。。。")

//  Thread.sleep(1000)


  // 使用回调方式

  println("回调开始。。。。。")

  val callBack = Future{
    Thread.sleep(Random.nextInt(500))
    42
  }

  println("回调-----------")
  callBack.onComplete{
    case Success(value) => println(s"成功: $value")
    case Failure(exception) => println(exception.printStackTrace())
  }

  Thread.sleep(1000)

  println("回调结束。。。。")

  println("多个有返回值的 future 开始.......")

  val futuresScala = new FuturesScala()

  val fuResult = for{
    r1 <- futuresScala.runAlgorithm(10)
    r2 <- futuresScala.runAlgorithm(20)
    r3 <- futuresScala.runAlgorithm(30)
  } yield r1 + r2 + r3

  fuResult onComplete{
    case Success(value) => println(s"有多个返回值的 -> $value")
    case Failure(e) => e.printStackTrace()
  }

  Thread.sleep(5000)

  println("多个有返回值的 future 结束.......")

}