package com.learn.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, PoisonPill, Props, Terminated}

/**
  * @author dt 2019/1/30 11:07
  */

class ChildActor extends Actor{
  override def receive: Receive = {
    case _ => println("子 actor")
  }
}

class AkkaWatchActor extends Actor{

  val kenny = context.actorOf(Props[ChildActor],name = "kenny")
  context.watch(kenny)
  override def receive: Receive = {
    case Terminated(`kenny`) => println("OMG, they killed kenny")
    case _ => println("子信息")
  }
}

object TestAkkaWatchActor extends App{

  val system = ActorSystem("DeathWatchTest")
  val parent = system.actorOf(Props[AkkaWatchActor],name = "watch")

  val kenny = system.actorSelection("/user/watch/kenny")
  kenny ! PoisonPill

//  Thread.sleep(5000)

  system.terminate()

}
