package com.learn.first.`trait`

import com.learn.first.TestTrait


/**
  * Created by dt on 17-8-2.
  */
trait Animal extends WaggingTail{

  this : TestTrait =>

  var userName: String

  var sex = "男"

  val age = 23

  def speak

  def eat {println("实体类")}

}
