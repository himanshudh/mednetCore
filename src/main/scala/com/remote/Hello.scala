package com.remote


import akka.actor.{Actor, Props}

class SuperActor extends Actor {
  def receive = {
    case "super" => {
       val actor =context.actorOf(Props[WorkerActor],"workeractor")
      actor ! "work"
    }
    case _  => println("huh?")
  }
}

class WorkerActor extends Actor{
  override def receive={
    case "work" => println("Task completed")
    case _ => print("Invalid task")
  }
}