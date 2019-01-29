package com.study.akka.baseActor

import akka.actor.{Actor, ActorIdentity, ActorRef, Identify, Terminated}

/**
  * @author dt 2018/12/10 15:20
  */
class Follower extends Actor{

  val identifyId = 1
  context.actorSelection("/user/another") ! Identify(identifyId)

  override def receive: Receive = {

    case ActorIdentity(`identifyId`,Some(ref)) =>
      context.watch(ref)
      context.become(active(ref))
    case ActorIdentity(`identifyId`,None) => context.stop(self)
  }

  def active(another: ActorRef): Actor.Receive = {
    case Terminated(`another`) => context.stop(self)
  }

}
