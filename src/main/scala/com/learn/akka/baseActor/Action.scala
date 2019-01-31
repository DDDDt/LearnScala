package com.learn.akka.baseActor

/**
  * @author dt 2018/11/6 16:42
  */
trait Action {

  val message: String

  val time: Int

}

/*开灯消息*/
case class TurnOnLight(time: Int) extends Action{
  override val message: String = "开灯"
}

/*烧水信息*/
case class BoilWater(time: Int) extends Action{
  val message = "烧水"
}