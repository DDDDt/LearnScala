package com.learn.first

import scala.util.Random

/**
  * Created by dt on 17-7-18.
  */
object TestNumber {


  def main(args: Array[String]): Unit = {

    val a = 100
    println(a.isValidInt)

      //
    val s = 1d
    println(s)

    val x = 1.23232

    val y = 0.123123

    println((x-y).abs)

    println(0.1+0.2)

    //sheng cheng suiji shu
    val r = Random;
    println(r.nextInt())

    println(r.nextInt(10))

    //chuang jian yige suiji changdu de  range

    val range = 0 to r.nextInt(10)

    println(range)

    r.nextPrintableChar()

    //she zhi bu chang
    val l = 1 to 10 by 3
    for(i <- l) yield println(i)
    println(l)

    //budao until
    for (i <- 1 until 5) yield println(i)

    var fo = for(i <- 1 to 6) yield i * 2;

    println(fo)

  }

}
