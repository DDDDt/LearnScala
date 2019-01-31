package com.learn.mapTuple

/**
  * map
  */
object MapObj {

  def main(args: Array[String]): Unit = {

    /*不可变的map*/
    val map = Map(1 -> 2,2 -> 3,3 -> 4,4 -> 5)
    map.foreach{case (k,v) => println(k,v)}

    /*可变的map*/
    val mapMutable = scala.collection.mutable.Map(1 -> 2,2 -> 3,3 -> 4,4 -> 5)
    mapMutable.foreach(v => println(v._1,v._2))
    println(map(1))

    /*加值*/
    mapMutable += 7 -> 10
    println(mapMutable)

    /*修改值*/
    mapMutable(1) = 10

    println(mapMutable)

    /*移除值*/
    mapMutable -= 7

    println(mapMutable)

    val a = map - 1

    println(a)

    println(mapMutable.getOrElse(2,"5"))


  }

}
