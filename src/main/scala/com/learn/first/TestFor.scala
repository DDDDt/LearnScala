package com.learn.first

import scala.annotation.switch
import scala.util.control.Breaks

/**
  * Created by dt on 17-7-19.
  */
object TestFor {

  def main(args: Array[String]): Unit = {


    val a = Array("apple","banna","orange")

    for(i <- a) println(i)

    val as = for(i <- a) yield i.toUpperCase


    //循环计数器
    for(i <- 0 until a.length) println(s"$i is ${a(i)}")

    //map
    val names = Map(
      "fname" -> "dt",
      "lname" -> "ds"
    )

    for((k,v) <- names) println("key："+k,"value:"+v)

    //foreach循环
    a.foreach(println)

    //foreach循环嵌套
    a.foreach(e => println(e.toUpperCase))

    //还可以选择代码块{}

    //多重循环
    for(i<- 0 to 10;j <- 0 to 11) println(s"i=$i,j=$j")

    //for循环打印出
    for(i <- 0 to 10 if i % 2 == 0) println(i)


    //for循环，break；中断
    Breaks.breakable{

      for (i <- 1 to 6)
        if(i > 4) Breaks.break()



    }

    val aa = if(2>3) 2 else 3;

    println(aa)

    //类似JAVA的switch case

    val ab = 1 match {

      case 1 => 'a'
      case 2 => 'b'
      case _ => 'c'
    }

    println(ab)

    //使用注解
    val bc = (2: @switch) match {

      case 1 => 'a'
      case 2 => 'b'
      case _ => 'c'

    }

    println(bc)


    val bd = 3 match {

      case 1 => 'a'
      case 2 => 'b'
      case _ => 'c'

    }

    println(bd+"asd")

    //多个匹配条件
    val cd = 5 match {

      case 1 | 2 |3 | 4 => println(1)
      case default => println(default)

    }


    //List集合
    val y = 1 :: 2 :: 3 :: Nil;

    y match {

      case n :: rest => println(n + "123")
      case Nil => println(6)

    }

    //使用try/catch
    val abc = "foo";

    try{

      abc.toInt

    }catch {
      case e : Exception => e.printStackTrace
    }

    //
    try{
      abc.toInt
    }catch {

      /*case e : Throwable => e.printStackTrace()*/

      case e : Exception => throw e

    }





  }

}