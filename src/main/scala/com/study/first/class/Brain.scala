package com.study.first.`class`

/**
  * Created by dt on 17-7-24.
  * Scala的单例模式
  *
  */
class Brain private{

  override def toString = "单例模式开启"

}

object Brain{

  val brain = new Brain

  def getInstance = brain

}




