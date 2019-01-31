package com.learn.akka.baseAkka;

import akka.actor.UntypedAbstractActor;

/**
 * @author dt 2018/11/6 15:38
 */
public class Greeter extends UntypedAbstractActor {

    public static enum Msg{
        GREET,DONE;
    }

    @Override
    public void onReceive(Object message) throws Throwable {

        if(message == Msg.GREET){
            System.out.println("hello world!");
            Thread.sleep(1000);
            getSender().tell(Msg.DONE,getSelf());
        }else{
            unhandled(message);
        }

    }
}
