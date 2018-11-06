package com.study.first.Collect

/**
  * Created by dt on 17-8-13.
  * 集合分割
  */
object fenge extends App{

  val a = List(15,10,5,8,20,12,1)

  //groupBy,返回的是一个map
  /*val b = a.groupBy(_>10)

  val b1 = b.apply(true)

  b1.foreach(println _)*/

  //返回一个tupe2
  /*val c = a.partition(_>10)
  c._1.foreach(println _)*/

  //碰到第一个不满足条件的，结束
  /*val d = a.span(_>10)
  d._1.foreach(println _)*/

  //从指定的序列分割
  /*val f = a.splitAt(2)
  f._1.foreach(println _)*/

  //定义元祖时
  /*val (g , h) = a.partition(_ > 10)
  g.foreach(println _)*/

  //返回指定长度的序列集,step是用来跳过指定的数
  /*val j = a.sliding(2).toList
  println(j)*/

  //跳过,第三个元素
  /*val k = a.sliding(2,3).toList
  println(k)*/

  //使用zip和unzip

  val listTuple = List((1,2),("a","b"))

  //返回两个元祖
  val x = listTuple.unzip
  println(x)

  //返回一个lIST，里面的元素为元祖
  val y2 = List(1,2)
  val y1 = List("a","b")

  val y = y2.zip(y1)

  println(y)

}
