package com.learn.`lazy`

/**
  * 懒加载 , 在调用的时候才会初始化
  */
object LazyObj {

  def main(args: Array[String]): Unit = {

    lazy val a = 123

    println(a)



  }

}
