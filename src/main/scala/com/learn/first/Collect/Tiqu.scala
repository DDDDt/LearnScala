package com.learn.first.Collect

/**
  * Created by dt on 17-8-13.
  */
object Tiqu extends App{

  //定义一个集合
  val a = (1 to 10).toArray

  /*a.foreach(println _)*/

  //去掉指定的那个元素的序列
  /*val b = a.drop(3)
  b.foreach(println _)*/

  //去掉让谓词为真的元素
  /*val c = a.dropWhile(_ > 5)
  c.foreach(println _)*/

  //从集合的结尾开始删除
  /*val d = a.dropRight(4)
  d.foreach(println _)*/

  //提取从头到第N个元素
  /*val f = a.take(5)
  f.foreach(println _)*/

  /*val a1 = Array(1,3,2,4,2,1)

  val g1 = a1.takeWhile(_ < 2)
  g1.foreach(println _)*/

  //返回让谓词为真的元素,碰到第一个不满足的结束
  /*val g = a.takeWhile(_ > 4)
  g.foreach(println _)*/

  //从后往前截取
  /*val h = a.takeRight(8)
  h.foreach(println _ )*/


  //截取从i - n的数。序列从0开始,不包含第n个
  /*val j = a.toList.slice(1,3)
  j.foreach(println _)*/

  //返回第一个元素
  /*val head = a.head

  println(head)

  val headOption = a.headOption

  */


  //删除最后一个元素
  /*val init = a.init
  init.foreach(println _)
*/

  //最后一个元素
 /* val last = a.last
  println(last)*/

  val tail = a.tail

  tail.foreach(println _)

}
