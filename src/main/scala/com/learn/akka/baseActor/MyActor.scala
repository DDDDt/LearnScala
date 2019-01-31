package com.learn.akka.baseActor

import akka.actor.{Actor, ActorSystem, Props}
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

  // 创建Props
  def main(args: Array[String]): Unit = {

    val props1 = Props[MyActor]

    // 不建议在另一个 actor 内使用, 因为它鼓励封闭作用域
    //val props7 = Props(new MyActor)

    // 使用 Props 创建 Actor
    val system = ActorSystem("mySystem")
    val myActor = system.actorOf(Props[MyActor],"myactor2")

  }

}
