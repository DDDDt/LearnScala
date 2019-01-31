package com.learn.`lazy`

/**
  * 循环
  */
object LoopStatements {

  def main(args: Array[String]): Unit = {

    /*其余大部分的只是和菜鸟联盟差不多,在for循环内部使用变量*/
    for (i <- 1 to 10 ; from = 4 - i; j <- from to 3) println(i+"--"+j)

  }

}
