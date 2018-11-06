package com.study.array

import scala.collection.mutable.ArrayBuffer

object ArrayObj {

  def main(args: Array[String]): Unit = {

    /*定义不可变的数组*/
    val a = new Array[String](10)
    a(0) = "1"
    a.foreach(println)
    /*自动推导数组*/
    val b = Array(1,2,3,4,5,6,7)
    b.foreach(println)

    /*定义可变数组*/
    val ab = ArrayBuffer[Int]()

    ab += 1

    ab += (1,2,3,4,5)

    ab.foreach(println)

    /*多维数组*/
    val dim = Array.ofDim[Int](3,4)
    dim(0)(0) = 1

    println(dim)

    import scala.collection.JavaConverters.bufferAsJavaList
    /*java scala 之间的转换,这部分有问题*/
    val pb = bufferAsJavaList(ab)

    println(pb.getClass)

    /*测试exists*/
    val list = List((1,2,3) , (4,5,6) , (7,8,9))

   println(list.exists(x => x._1 == 10))

  }

}
