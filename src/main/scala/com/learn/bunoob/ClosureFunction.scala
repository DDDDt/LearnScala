package com.learn.bunoob

/**
  * 闭包
  */
object ClosureFunction {

  def main(args: Array[String]): Unit = {

    /*匿名函数*/
    val multiplier = (i:Int) => i*10
    /*闭包思路*/
    val factor = 3
    val multiplierClosure = (i:Int) => i * factor

    println(multiplier(1))
    println(multiplierClosure(1))


  }

}
