package com.learn.akka.simpleIntroduction

import java.util.concurrent.TimeUnit

import akka.actor.{Actor, ActorSystem, PoisonPill, Props}
import akka.pattern.gracefulStop

import scala.concurrent.Await
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration._

/**
  * @author dt 2019/1/29 18:51
  * 停止 actor
  */
class StopActor extends Actor{
  override def receive: Receive = {
    case "stop" => context.stop(self)
    case _ => println("TestActor got message")
  }
}

object TestStopActor extends App{

  val actorSystem = ActorSystem("TestStopActor")
  val stopActor = actorSystem.actorOf(Props[StopActor],name = "testStop")
  stopActor ! "..."

  // 停止一个 Actor
//  actorSystem.stop(stopActor)

  // 在 actor 内部停止一个 actor
//  stopActor
  //  ! "stop"

  // 使用 poisonPill 停止
//  stopActor ! PoisonPill


  // 使用 gracefulStop 关闭
  val stopped = gracefulStop(stopActor,FiniteDuration(2,TimeUnit.SECONDS))
  Await.result(stopped,3 seconds)
  println("testActor was stopped")


  actorSystem.terminate()

}
