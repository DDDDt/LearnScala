package com.study.first.`class`

/**
  * Created by dt on 17-7-23.
  */
class Person (var firstName: String,var lastName: String,val userName: String,private val userName1: String,userName2: String){

  println("the constructor begins")

  private val home = System.getProperty("user.home")

  var age = 0;

  override def toString = s"$firstName $lastName is $age years old"

  def printHome{println(s"HOME = $home")}

  def printFullName{ println(this)}

  printHome
  printFullName

  println("still in the constructor")



}
