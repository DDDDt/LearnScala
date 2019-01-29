package com.study.akka.simpleIntroduction

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * @author dt 2019/1/29 16:31
  * Akka 发送信息
  * Actor 应当通过发送不可变消息在彼此之间通信,
  * 在这种情况下, 有4中消息被定义为 case 对象
  *
  */

case object PingMessage
case object PongMessage
case object StartMessage
case object StopMessage

class Ping(pong: ActorRef) extends Actor{

  var count = 0
  def incrementAndPrint{ count += 1; println("Ping")}

  override def receive: Receive = {

    case StartMessage =>
      incrementAndPrint
      pong ! PingMessage
    case PongMessage =>
      incrementAndPrint
      if(count > 99){
        sender ! StopMessage
        println("ping stopped")
        context.stop(self)
      }else{
        sender ! PingMessage
      }
    case _ => println("Ping got something unexpected.")

  }
}
class Pong extends Actor{
  override def receive: Receive = {
    case PingMessage =>
      println("pong")
      sender ! PongMessage
    case StopMessage =>
      println("pong stopped")
      context.stop(self)
    case _ => println("Pong got something unexpected.")
  }
}

object PingPongTest extends App{

  val system = ActorSystem("PingPongSystem")
  val pong = system.actorOf(Props[Pong],name = "pong")
  val ping = system.actorOf(Props(new Ping(pong)),name = "ping")

  ping ! StartMessage


}