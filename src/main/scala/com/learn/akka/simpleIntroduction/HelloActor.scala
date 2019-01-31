package com.learn.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Props}

/**
  * @author dt 2019/1/29 15:35
  *  无参构造一个 ActorSystem
  */
class HelloActor extends Actor{
  override def receive: Receive = {
    case "hello" => println("hello back at you")
    case _ => println("结束")
  }
}

object TestHelloActor extends App{

  // 一个 actor 需要一个 ActorSystem, 无参数类型
  val system = ActorSystem("HelloSystem")
  // 创建一个actor
  val helloActor = system.actorOf(Props[HelloActor],name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"

  // 系统结束
  system.terminate()


}