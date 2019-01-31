package com.learn.first.`class`

/**
  * Created by dt on 17-7-26.
  */
class TestFunction {


  def makeConnection(timeOut: Int = 5000,protocol: String = "http"): Unit ={

    println("timeout = %d,protocol=%s".format(timeOut,protocol))

  }

  //接受一个变参,且变参必须是最后一个参数
  def makeStrings(num:Int,strings:String*): Unit ={

    strings.foreach(println)
    println(num)

  }

  //方法的异常声明,注解声明式异常
  @throws(classOf[Exception])
  def chu(a:Int,b:Int): Int={

    a/b

  }

  //返回多个参数的方式
  def rePars = {

    ("123","456","789")

  }

  def reParss()={
    ("333","555","555")
  }

}
