package com.learn.first.`class`

/**
  * Created by dt on 17-7-18.
  */
class TestNumber (s:String){

  def toInt(radix:Int) = Integer.parseInt(s);

  def toInt(s:String):Option[Int]={

    try {
      Some(s.toInt)
    }catch{
      case e:NumberFormatException => None
    }

  }

}
