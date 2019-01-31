package com.learn.akka.baseAkka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author dt 2018/11/6 15:45
 */
public class TestBaseAkka {

    public static void main(String[] args) {

        ActorSystem system = ActorSystem.create("Hello");
        ActorRef actorRef = system.actorOf(Props.create(HelloWorldActor.class));
        System.out.println(actorRef.path());

    }

}
