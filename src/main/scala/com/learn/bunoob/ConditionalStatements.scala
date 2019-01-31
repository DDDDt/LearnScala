package com.learn.bunoob

/**
  * 条件判断语句
  */
object ConditionalStatements {

  def main(args: Array[String]): Unit = {

    val a = if ( 1 > 2) 1 else 2
    println(a)

    /*还可以使用语句块*/
    if(1>2){
      println(1)
    }else{
      println(2)
    }

    /*多次判断 if else if else*/
    if( 1 > 2 ){
      print(1)
    }else if( 1 == 2){
      print(2)
    }else{
      print(3)
    }
  }

}
