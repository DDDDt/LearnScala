package com.study.bunoob

import java.util.Date

/**
  * scala 的函数
  */
object FunctionObj {

  /*一般函数*/
  def addInt(a:Int,b:Int): Int ={

    var sum : Int = 0
    sum = a + b
    sum
  }

  /*scala 函数传值调用*/
  def time() ={

    println("获取时间 , 单位为纳秒")
    System.nanoTime

  }
  /*scala 函数传名调用*/
  def deplayed( t: => Long ) = {

    println("在 deplayed 方法内")
    println("参数: "+t)
    t

  }

  /*可变参数*/
  def printStrings(args:String*)={

    args.foreach(x => println(x))

  }

  /* 设置默认参数值 */
  def sumInt(a:Int=5,b:Int=7):Int = {
    a+b
  }

  /*函数嵌套 , 定义在函数内的函数称之为局部函数*/
  def factorial(i:Int):Int = {
    def fact(i:Int,accumulator: Int):Int = {
      if(i <= 1)
        accumulator
      else
        fact(i - 1,i * accumulator)
    }
    fact(i,1)
  }

  /*scalaa 偏应用函数*/
  def log(data: Date, message: String) = {
    println(data + "------" + message)
  }

  def main(args: Array[String]): Unit = {

    val sum = addInt(1,2)
    println(sum)

    time()
    deplayed(time())

    printStrings("1","2","3")

    val sumResult = sumInt(1,2)
    println(sumResult)
    println(sumInt())

    val result = factorial(1)
    println(result)

    /*函数全部传值*/
    val date = new Date
    log(date,"message1")
    log(date,"message2")
    log(date,"message3")
    /*使用偏函数方式,使用_替换缺失的参数列表*/
    val logWithDateBound = log(date,_: String)
    logWithDateBound("message1")
    logWithDateBound("message2")
    logWithDateBound("message3")



  }

}
