package com.study.bunoob

/**
  * 参数应该相当于java的构造函数
  * @param xc
  * @param yc
  */
class Point(xc: Int,yc: Int) {

  val x: Int = xc

  val y: Int = yc

  def move{

    println(x,y)

  }

}
