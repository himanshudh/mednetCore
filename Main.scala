import akka.actor.{Props, ActorSystem}


object Main extends App {
  val system = ActorSystem("HelloSystem")

  // default Actor constructor
  val helloActor = system.actorOf(Props[SuperActor], name = "superactor")
  helloActor ! "super"
  helloActor ! "buenos dias"
}