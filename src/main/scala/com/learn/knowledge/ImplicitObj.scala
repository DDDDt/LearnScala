package com.learn.knowledge

/**
  * 隐式转换知识点
  */
object ImplicitObj {

  def main(args: Array[String]): Unit = {

    implicit val concurrentTaxRate = 0.08F

    println(concurrentTaxRate * 5)

  }

}
