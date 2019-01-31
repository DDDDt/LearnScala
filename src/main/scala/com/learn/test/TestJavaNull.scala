package com.learn.test

/**
  * 测试调用 java 的方法 , java 返回 null
  */
object TestJavaNull {

  def main(args: Array[String]): Unit = {

    val a = null
    println(a == null)

    val optionA = Option(new TestNull().getStr)
    println(optionA.isEmpty)

    val list = List(1,2,3,4,5,6,7)
    list.foreach(x => println(x))
    list.foreach(x => println(x))

    var b = 0
//    b = if(0 > 1) 1


  }

}
