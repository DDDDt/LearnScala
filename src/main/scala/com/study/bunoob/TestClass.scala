package com.study.bunoob

/**
  * 测试类和对象
  */
object TestClass {

  def main(args: Array[String]): Unit = {

    val pt = new Point(10,20)

    pt.move

    val location = new Location(1,2)
    location.move

  }

}
