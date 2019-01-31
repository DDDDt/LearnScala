package com.learn.first

/**
  * Created by dt on 17-8-3.
  */
object TestStudyFunction {

  def main(args: Array[String]): Unit = {


    val x = List.range(1,10)

    x.foreach(println)

    //保留偶数
    //var y = x.filter((i:Int) => i%2 == 0)

    val y = x.filter(_%2==0)

    y.foreach(print)

    /*
      Map里定义方法
     */
    val newX = x.map(_%2==0)

    println(newX)

    /**
      * NOT
      */
    val f = (i:Int) => i * 2

    println(f(2))

    /**
      * xianshide return
      */
    val fB : Int => Boolean = i => i%2==0

    val fc : Int => Boolean = _ % 2 ==0

    val sayHello= () => println("say hello")
    getFunction(sayHello)

  }

  /**
    *ba hanshu dangzuo yige canshu
    */
  def getFunction(f:()=>Unit):Unit={
    f()
  }

}
