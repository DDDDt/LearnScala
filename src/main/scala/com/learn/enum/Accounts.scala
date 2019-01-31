package com.learn.enum

import java.time.temporal.TemporalAmount

/**
  *
  */
class Accounts {

  var id = Accounts.newUniqueNumber()

  private var balance = 0.0

  def deposit(amount: Double){balance += amount}

}

/**
  * 伴生对象
  */
object Accounts{

  private var lastNumber = 0

  def newUniqueNumber() = {lastNumber += 1; println(lastNumber); lastNumber}

}
