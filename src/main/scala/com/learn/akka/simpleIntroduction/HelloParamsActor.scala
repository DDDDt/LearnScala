package com.learn.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Props}

/**
  * @author dt 2019/1/29 16:17
  * 带参数构造 ActorSystem
  */
class HelloParamsActor(myName: String) extends Actor{
  override def receive: Receive = {
    case "hello" => println(s"hello,$myName")
    case _ => println(s"结束,$myName")
  }
}

object TestHelloParamsActor extends App{

  val system = ActorSystem("HelloSystem")
  val helloActor = system.actorOf(Props(new HelloParamsActor("Fred")),name = "helloactor")

  helloActor ! "hello"
  helloActor ! "buenos dias"

  system.terminate()

}
