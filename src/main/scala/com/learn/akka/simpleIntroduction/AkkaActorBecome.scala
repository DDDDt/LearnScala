package com.learn.akka.simpleIntroduction

import akka.actor.{Actor, ActorSystem, Props}

/**
  * @author dt 2019/1/30 14:38
  */

case object ActNormalMessage
case object TryToFindSolution
case object BadGuysMakeMeangry

class AkkaActorBecome extends Actor{

  def angryState: Receive = {
    case ActNormalMessage =>
      println("angryState......")
      context.become(normalState)
  }

  def normalState: Receive = {
    case TryToFindSolution => println("normalState -> TryToFindSolution")
    case BadGuysMakeMeangry =>
      println("normalState -> BadGuysMakeMeangry")
      context.become(angryState)
    case _ => println("normalState -> 没有匹配上")
  }

  override def receive: Receive = {
    case BadGuysMakeMeangry => context.become(angryState)
    case ActNormalMessage => context.become(normalState)
  }
}

object TestAkkaActorBecome extends App{

  val actorSystem = ActorSystem("AkkaActorBecome")
  val davidBanner = actorSystem.actorOf(Props[AkkaActorBecome],name = "ActorBecome")
  davidBanner ! ActNormalMessage
  davidBanner ! TryToFindSolution
  davidBanner ! BadGuysMakeMeangry
  Thread.sleep(1000)
//  davidBanner ! ActNormalMessage
  actorSystem.terminate()
}