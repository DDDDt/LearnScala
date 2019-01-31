package com.learn.beans

import scala.beans.BeanProperty

/**
  *  学习类
  *  判断自动生成的 get 和 set
  *  主构造器也可以定义成私有的
  *
  *
  */
class Counter {

  private var value = 0

  private val value1 = 1

  var value2 = 2

  val value3 = 3

  /*生成和 java bean 一样的方法*/
  @BeanProperty val value4 = 4

  @BeanProperty var value5 = 5

  /*辅助构造器*/
  def this(value:Int){
    this()
    this.value = value
  }
  /*定义私有的辅助构造器*/
  private def this(value:Int,value2:Int){
    this(value)
    this.value = value
    this.value2 = value2
  }



  def increment(){value+=1}

  def current() = value

  def isLess(other: Counter) = value < other.value

  /*嵌套类*/
  class CounterName{

    /*可以使用方法*/
    val value = Counter.this.value2

    def prinValue(){println(value)}

  }

  def getCounterName():CounterName={
    new CounterName

  }

}
