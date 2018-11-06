package com.study.first

import com.scala.study.`class`.Test

/**
  * Created by dt on 17-6-29.
  */
object ScalaTest1 {

  def main(args: Array[String]): Unit = {

    //声明变量不初始化,会报错
    val test1 = "test"

    //获得两个字符串相同的一组字符
    val test2 = "Hello".intersect("World");

    val a = new Test();

    val b = a.del(3,2);

    a pt "3";

    //获取不重复的元素
    val dis = "hello".distinct;

    println(dis)

    println(b);

    println(test2)

    print(test1)


  }

}
