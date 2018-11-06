package com.study.bunoob

/**
  * 字符串的一些常规操作
  */
object StringStatement {

  def main(args: Array[String]): Unit = {

    /*定义字符串*/
    val s = "123"
    val a : String = "123"
    println(a)
    println(s)
    /*定义可变的字符串*/
    val sb = new StringBuilder
    sb += 'a'
    sb ++= "123"
    println(sb)
    /*创建格式化字符串*/
    val floatVal = 12.456
    val intVal = 2000
    val stringVal = "abc"
    /*要用printf*/
    printf("字符串为,%f_%d_%s",floatVal,intVal,stringVal)

  }

}
