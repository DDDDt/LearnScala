package com.study.bunoob

object PatternMatch {

  def main(args: Array[String]): Unit = {

    println(matchTest(3))
    casePersonTest("Alice",25)

  }

  def matchTest(x: Any): Any = x match {

    case 1 => "one"
    case 2 => "two"
    case "two" => 2
    /*用来匹配类型是否为Int类型*/
    case y: Int => "scala Int"
    case _ => "many"

  }

  /*使用样例匹配类*/
  def casePersonTest(name: String, age: Int): Unit ={

    new Person(name,age) match {

      case Person("Alice",25) => println("Hi Alice")
      case Person("Bob", 32) => println("Hi Bob!")
      case Person(name,age) =>
        println("Age: "+ age + "year,name:"+name)

    }

  }

  /*使用样例类*/
  case class Person(name: String, age: Int)

}
