package com.learn.first

/**
  * Created by dt on 17-6-29.
  * Scala循环
  */
object ScalaTest2 {

  def main(args: Array[String]): Unit = {

    println(args.getClass)

    val aa = 123.asInstanceOf[Int]
    println(aa.getClass)

    //相当于JAVA的.class,里面要求是类
    //println(classOf[args])

    //if else循环

    //最基础的if else循环
    /*val a = ifELse(2);*/
    //简易写法
   /* val b = if (2 > 0) 1 else -1;

    var y = 1;

    val x = y = 1;*/

    //循环判断

    /*var n = 8;

    while (n > 0){

      n -= 1;

    }

    //for循环

    for (i <- 1 to 8){

      println(11);

    }

    //for循环，不含上限
    for(i <- 0 util 8) {

      println(i)

    }

    println(n)

    println(x,"11",y);

    println(y=1)

    println(b);

    println(a);


  }

  def ifELse(x: Int): Int={

    if(x>1)
      1
    else
      x

  }*/

    print("helloWOrld".getClass.getName)


    val s =
      """sdsd
        sdsa
        sad
        asd
      """

    print(s)

    //使用字符串嵌套
    val name = "dt"

    val age = 24

    val nameAge = s"dt:${age+1}"

    println(nameAge)


    val userAGe = "sdsdsdsdsad".toUpperCase

    var userAGe1 = "sfdsfdsfsdf".map(_.toUpper)

    println(userAGe)

    println(userAGe1)

    for(c <- "hello") println(c.toUpper)

  }
}
