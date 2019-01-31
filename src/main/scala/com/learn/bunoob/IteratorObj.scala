package com.learn.bunoob

/**
  * 迭代器
  */
object IteratorObj {

  def main(args: Array[String]): Unit = {

    val it = Iterator("Baidu","Google","Runoob")

    while (it.hasNext){
      println(it.next())
    }

    println(it)

  }

}
