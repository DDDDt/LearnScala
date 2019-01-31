package com.learn.enum

/**
  * scala 中的枚举类
  * scala 本身没有枚举类，需要通过其他方式继承来实现
  */
object TrafficLightColor extends Enumeration {

  type TrafficLightColor = Value


//  val Red = Value(0,"红色")
//  val Yellow = Value("黄色")
//  val Green = Value("绿色")


  val Red, Yellow, Green = Value

}
