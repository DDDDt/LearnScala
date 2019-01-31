package com.learn.akka.baseActor

import scala.concurrent.Future
import akka.pattern.{ask, pipe}
/**
  * @author dt 2018/12/10 17:30
  *  Ask 模式
  */
class AskActor {

/*
  val f: Future[Result] =
    for {
      x <- ask(actorA,Request).mapTo[Int]
      s <- (actorB ask Request).mapTo[String] // call by implicit conversion
      d <- (actorC ? Request).mapTo[Double]
    } yield Result(x,s,d)
*/

//  f pipeTo actorD // .. or ..
//  pipe(f) to actorD

}
case class Result(x: Int,s: String,d: Double)
case object Request