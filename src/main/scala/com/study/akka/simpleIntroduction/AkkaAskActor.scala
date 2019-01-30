package com.study.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Props}
import akka.util.Timeout

import scala.concurrent.duration._
import akka.pattern.ask

import scala.concurrent.Await
/**
  * @author dt 2019/1/30 14:12
  * 有返回值的 actor
  * 有返回值的 actor
  */

case object AskNameMessage

class AkkaAskActor extends Actor{
  override def receive: Receive = {
    case AskNameMessage => sender ! "dtttt"
    case _ => println("没有匹配上")

  }
}

object TestAkkaAskActor extends App{

  val system = ActorSystem("AskTestSystem")
  val myActor = system.actorOf(Props[AkkaAskActor], name = "myActor")

  implicit val timeout = Timeout(5.seconds)

  val future = myActor ? AskNameMessage
  val result = Await.result(future,timeout.duration).asInstanceOf[String]

  println(result)

  system.terminate()

}
