package com.study.bunoob

/**
  * scala 的集合学习
  */
object CollectionObj {

  def main(args: Array[String]): Unit = {

    /*不可变列表*/
    val site: List[String] = List("Runoob","Google","Baidu")

    //空列表
    val empty : List[Nothing] = List()
    //二维列表
    val dim : List[List[Int]] = List(
      List(1,0,0),
      List(0,1,0),
      List(0,0,1)
    )
    /*使用简洁的方式来构造,构造方法的两个基本单位是Nil和::*/
    val siteTmp = "Runoob" :: "Google" :: "Baidu" :: Nil
    val siteNew = "Runoob" :: ("Google" :: ("Baidu" :: Nil))

    val emptyTmp = Nil

    val dimTmp = (1 :: 0 :: 0 :: Nil) :: (0 :: 0 :: 1 :: Nil) :: (0 :: 0 :: 1 :: Nil) :: Nil

    println(dimTmp)

    /*通过给定函数来创建列表*/
    val squares = List.tabulate(4,5)(_*_)
    println(squares)

    /*Set 集合*/
    val set = Set(1,2,3)

    /*Map */
    val map = Map("a" -> 1,"b" -> "2","c" -> 3)

    map.foreach(println)

    /*使用case 来*/
    map.foreach{
      case (key,value) =>
        println(key,value)
    }

    println(map)

    /*元组*/
    val t = (1,3.14,"fred")
    //使用原始的定义元组的方式
    val tu = new Tuple3(1,3.14,"Fred")
    println(tu)
    /*访问元素*/
    println(t._1)

    /*使用Option来访问*/
    val value1 : Option[Any] = map.get("123")

    println(value1.getOrElse("0"))


  }

}
