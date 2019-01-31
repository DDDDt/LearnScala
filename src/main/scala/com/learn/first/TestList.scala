package com.learn.first

import scala.collection.mutable.ListBuffer

/**
  * Created by dt on 17-8-24.
  */
object TestList extends App{

  //创建可变的集合
  val listBuf = new ListBuffer[String]()

  listBuf += "123"
  listBuf += "456"
  listBuf += "789"

  println(listBuf)

  listBuf -= "123"
  listBuf -= "234"
  listBuf -= ("135","456")
  listBuf --= Seq("dt","888")
  println(listBuf)

  val list = listBuf.toList
  println(list)

  val f = new Printer
  f.>>(42)
  f.>>:(42)
  f >> 42
  42 >>: f

  val x = List(1)

  val x1 = 0 +: x

  val x2 = x :+ 0

  val map = Map("a"->"a","b"->"b")

  map.filter(_ == "a")

  println(map)

  println(x.exists(_==1))


}

class Printer{

  def >>(i:Int){println(s"$i")}
  def >>:(i:Int){println(s"$i")}

}