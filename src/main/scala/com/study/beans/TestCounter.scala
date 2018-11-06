package com.study.beans

object TestCounter {

  def main(args: Array[String]): Unit = {

    val counter = new Counter

    counter.increment()
    /*可以选择省略方法调用的()*/
    println(counter.current)

    /*判断生成的get set方法*/
    counter.value2 = 3
    println(counter.value2)
    /*没有生成set方法*/
//    counter.value3 = 4

    val counter1 = new Counter(1)

    /*定义成私有的构造器，在外调用就出错*/
//    val counter2 = new Counter(1,2)

    counter.getCounterName().prinValue()

  }

}
