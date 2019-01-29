package com.study.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Props}

/**
  * @author dt 2019/1/29 17:02
  * Actor 生命周期
  */
class AkkaLifeActor extends Actor{

  override def preStart(): Unit = println("preStart")

  override def postStop(): Unit = println("postStop")

  override def preRestart(reason: Throwable, message: Option[Any]): Unit = {
    println("preRestart")
    println(s"${reason.getMessage}")
    println(s"${message.getOrElse("")}")
    super.preRestart(reason, message)
  }

  override def postRestart(reason: Throwable): Unit = {
    println("postRestart")
    println(s"${reason.getMessage}")
    super.postRestart(reason)
  }

  override def receive: Receive = {

    case "success" => throw new Exception("GG")
    case _ => println("没有匹配到")

  }
}

object TestAkkaLifeActor extends App{

  val system = ActorSystem("LifeDemo")
  val life = system.actorOf(Props[AkkaLifeActor],name = "lifeDemo")
  println("hello")
  life ! "hello"
  Thread.sleep(1000)
  println("报异常")
  life ! "success"
  Thread.sleep(1000)
  println("关闭")
  system.stop(life)
  Thread.sleep(1000)
  println("终结")
  system.terminate()

}
