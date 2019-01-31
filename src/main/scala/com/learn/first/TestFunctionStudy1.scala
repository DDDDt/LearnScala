package com.learn.first

/**
  * Created by dt on 17-8-6.
  */
object TestFunctionStudy1 extends App{

  var a = 1

  val sum = (i:Int) => println(i+a)

  def exec(x:Int => Unit): Unit ={

    x(1)

  }

  sum(2)

  //闭包
  a = 3

  sum(2)

  exec(sum)

  //使用部分应用函数
  val count = (d : Int, b : Int, c : Int) => {d+b+c}

  val cont1 = count(1,2,_:Int)

  println(cont1(2))

  //创建部分应用函数
  //val divider = (x:Int) => 42 / x 为0是不行
  val divider = new PartialFunction[Int,Int] {

    override def apply(v1: Int): Int = 42 / v1

    override def isDefinedAt(x: Int): Boolean =  x != 0

  }

  divider.isDefinedAt(0)

//  val list = List(0 to 10)

//  list.map(divider)

//  List(0,1,2,3) map(divider)

  List(0,1,2,3) collect(divider)


}
