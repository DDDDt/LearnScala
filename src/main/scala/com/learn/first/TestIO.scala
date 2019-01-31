package com.learn.first

import scala.io.Source

/**
  * Created by dt on 17-8-30.
  */
object TestIO extends App{

  var fileName = "./TestOBject.scala";

  //弊端，关闭
  for(line <- Source.fromFile(fileName).getLines){

    println(line)

  }

  //贷款模式
  def using[A <: {def close():Unit},B](source:A)(f:A=>B):B=
    try{
      f(source)
    }finally{
      source.close()
    }

}


