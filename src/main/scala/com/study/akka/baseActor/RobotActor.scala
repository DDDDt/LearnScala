package com.study.akka.baseActor

import akka.actor.{Actor, ActorSystem, Props}
import akka.event.Logging

/**
  * @author dt 2018/11/6 16:45
  */
class RobotActor extends Actor{

  val log = Logging(context.system,this)

  override def receive: Receive = {

    case t: TurnOnLight => log.info(s"${t.message} after ${t.time} hour")
    case b: BoilWater => log.info(s"${b.message} after ${b.time} hour")
    case _ => log.info("未匹配到响应信息")
  }
}

object Example_01 extends App{

  val actorSystem = ActorSystem("robot-system")
  val robotActor = actorSystem.actorOf(Props(new RobotActor()),"robotActor")
  robotActor ! TurnOnLight(1)
  robotActor ! BoilWater(2)
  robotActor ! "who are you"

  // 终止
  actorSystem.terminate()
}
