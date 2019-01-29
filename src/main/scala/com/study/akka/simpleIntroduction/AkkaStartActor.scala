package com.study.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, PoisonPill, Props}

/**
  * @author dt 2019/1/29 17:48
  * 在 actor 里创建字 actor
  */

case class CreateChild(name: String)
case class Name(name: String)

class AkkaStartActor extends Actor{

  var name = "noName"

  override def postStop(): Unit = {
    println(s"name = $name : ${self.path}")
    super.postStop()
  }

  override def receive: Receive = {
    case Name(name) => this.name = name
    case _ => println(s"Child $name got message")
  }
}

class Parent extends Actor{
  override def receive: Receive = {
    case CreateChild(name) =>
      println(s"name = $name")
      val child = context.actorOf(Props[AkkaStartActor],name = s"$name")
      child ! Name(name)
    case _ => println("parent no some other")
  }
}

object TestAkkaStartActor extends App{

  val actorSystem = ActorSystem("ParentChildTest")
  val parent = actorSystem.actorOf(Props[Parent], name = "Parent")
  parent ! CreateChild("dt")
  parent ! CreateChild("dt1")
  Thread.sleep(1000)

  // 选择某个 actor
  println("选择某个 actor")
  val dt = actorSystem.actorSelection("/user/Parent/dt")
  dt ! PoisonPill
  println("dt 终结")
  Thread.sleep(1000)

  println("终结结束")

  actorSystem.terminate()

}
