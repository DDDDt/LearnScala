package com.learn.bunoob

import scala.util.control.Breaks

/**
  * 循环判断
  */
object LoopStatements {

  def main(args: Array[String]): Unit = {

    var a = 10
    /*while 循环*/
    while( a < 20 ){
      println("a = "+a)
      a += 1
    }

    /*do while 循环*/
    var b = 10
    do {
      b += 1
      println("b = " + b)
    }while( b < 20 )

    /*for 循环*/
    for( x <- 1 to 10){
      println("to x = " + x)
    }
    for( x <- 1 until 10){
      println("until x = " + x)
    }

    /**
      * 多重 for 循环 嵌套
      * 相当于多重for循环嵌套
      */
    for( x <- 1 to 10; c <- 1 until 10 ){

      println("x = "+x)
      println("c = "+c)

    }

    /*for 循环集合*/
    val list = List(1,2,3,4,5,6,7,8,9,0)
    list.foreach(x => println(x))
    /*使用for循环*/
    for( d <- list){
      println(d)
    }
    /*for循环过滤*/
    for(x <- list if x > 3 ; if x < 8){
      println(x)
    }

    /*使用 for 循环 yield*/
    val newlist = for{
      d <- list
      if d > 2
      if d < 8
    }yield d

    newlist.foreach(x => println(x))

    /*终端循环操作*/
    val loop = new Breaks

    loop.breakable{
      for( d <- list ){
        println(d)
        if( d == 2 ){
          loop.break
        }
      }
    }

  }
}
