package com.study.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Kill, Props}

/**
  * @author dt 2019/1/30 10:38
  *  kill actor
  */
class AkkaKillActor extends Actor{


  override def preStart(): Unit = println("preStart")

  override def postStop(): Unit = println("postStop")

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    println("preRestart")
    super.preRestart(reason, message)
  }

  override def postRestart(reason: Throwable): Unit = {
    println("postRestart")
    super.postRestart(reason)
  }

  override def receive: Receive = {
    case _ => println("进来了")
  }
}

object TestKillActor extends App{

  val actorSystem = ActorSystem("KillActor")
  val numbers = actorSystem.actorOf(Props[AkkaKillActor],name = "testKillActor")
  numbers ! "hello"
  numbers ! Kill
  actorSystem.terminate()

}