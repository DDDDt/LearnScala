package com.study.akka.baseActor

import akka.actor.Actor
import akka.event.Logging

/**
  * @author dt 2018/11/6 15:07
  */
class MyActor extends Actor{

  val log = Logging(context.system,this)

  override def receive: Receive = {

    case "test" => log.info("接受到信息")
    case _ => log.info("没有接收到信息")

  }
}
