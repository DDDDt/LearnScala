package com.learn.bunoob

/**
  * 数组
  */
object ArrayObj {

  def main(args: Array[String]): Unit = {

    /*声明数组 , 定长*/
    val arr : Array[String] = new Array[String](3)
    val array = new Array[String](3)

    arr(0) = "runoob"
    arr(1) = "baidu"
    arr(4/2) = "google"

    arr.foreach(x => println(x))

    /*处理数组*/
    for(x <- arr) println(x)

    /*多维数组*/
    val myMatrix = Array.ofDim[Int](3,3)

    for(i <- 0 to 2 ; j <- 0 to 2) myMatrix(i)(j) = j

    myMatrix.foreach(x => println(x(0)))

    /*具体的数组操作方法,待以后学习*/

  }
}
