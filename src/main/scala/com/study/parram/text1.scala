package com.study.parram

object text1 {
  def main(args: Array[String]): Unit = {

    /*两者的区别是a是可变的, 而b是不可变的*/
    var a = 0
    var b = 0
    /*可以*/
    a = 1
    /*报错*/
    b = 1
    val c = b.toString
    print(c)
    /*定义变量的时候 , 声明类型*/
    val d : String = "123"
    print(d)

    /*定义类型*/
    val myVal : String = "FOO"

    println(myVal)

    println(myVal.contains("F"))

  }
}
