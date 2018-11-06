package com.study.bunoob

/**
  * 伴生类对象
  */
private class Marker(color:String) {

  println(color)

  override def toString: String = "颜色标志: " + color

}

object Marker{

  def main(args: Array[String]): Unit = {

    val marker = new Marker("红色")

    new Marker("红色").toString

  }

}
