package com.study.bunoob

/**
  * 判断scala的修饰类型的范围
  */
object AccessSpecifiers {

  class Inner{
    /*如果没有返回值可以省略等号*/
    private def f(){print("private")}
    protected def fPro(){print("protected")}
    def fPub(){
      print("public")}
    class InnerMost{
      /*正确*/
      f()
    }

  }

  /*继承类*/
  class InnerMostEx extends Inner{

    /*私有的定义不可以*/
//    f()
    fPro()

  }

  def main(args: Array[String]): Unit = {

    val inner = new Inner
    /*只有公共的才可以访问*/
    inner.fPub()

  }

}
