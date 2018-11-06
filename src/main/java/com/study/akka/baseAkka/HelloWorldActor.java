package com.study.akka.baseAkka;


import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedAbstractActor;

/**
 * @author dt 2018/11/6 15:30
 * akka actor helloWorld
 */
public class HelloWorldActor extends UntypedAbstractActor {

    @Override
    public void preStart() throws Exception {
        final ActorRef greeter = getContext().actorOf(Props.create(Greeter.class));
        greeter.tell(Greeter.Msg.GREET,getSelf());
    }

    @Override
    public void onReceive(Object message) throws Throwable {

        if(message == Greeter.Msg.DONE){
            getContext().stop(getSelf());
        }else{
            unhandled(message);
        }

    }
}
