package com.study.first

import scala.collection.mutable.ArrayBuffer

/**
  * Created by dt on 17-8-8.
  */
object TestCollection extends App{

  //定义集合，并给予类型
  val x = List[Number](1,2,3.0,4.00,5.8)

  //定义可变集合
  var fruits = ArrayBuffer[Int](1,2,3)

  fruits += 4
  fruits -= 1

  //插入一个元素
  fruits.append(1)

  fruits.insert(0,1,2,3,3)

  fruits.remove(1,2)

  fruits.trimStart(2)

  fruits.trimEnd(1)

  println(fruits)


  //定义一个map集合
  val m = Map("name"->"dt","age"->"25")

  m.foreach(x=>println(s"${x._1},${x._2}"))

  m.foreach{

    case (key,value) =>
      println(s"$key,$value")

  }

  //使用for循环来遍历集合
  for(f <- fruits) println(f)
  //使用zipWIthIndex来遍历集合,前面是值，后面是序列
  for((index,value) <- fruits.zipWithIndex) println(s"$index,$value")
  //有返回值的循环
  val fruitsFilter = for(f <- fruits) yield f > 3
  println(fruitsFilter)




}
