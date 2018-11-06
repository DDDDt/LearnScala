package com.study.first

import com.study.first.`class`.TestFunction


/**
  * Created by dt on 17-7-26.
  */
object TestFunction{

  def main(args: Array[String]): Unit = {

    val c = new TestFunction()

    c.makeConnection()

    c.makeConnection(2000)

    //实现一个多参数的形式
    c.makeStrings(147,"123","456","789")

      c.chu(1,0)

    c.rePars._1


  }


}
