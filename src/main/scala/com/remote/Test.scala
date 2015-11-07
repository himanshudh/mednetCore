package com.remote

import akka.actor.{ActorSystem, Props}


object Test extends App {
  val system = ActorSystem("HelloSystem")

  // default Actor constructor
  val helloActor = system.actorOf(Props[SuperActor], name = "superactor")
  helloActor ! "super"
  helloActor ! "buenos dias"
}