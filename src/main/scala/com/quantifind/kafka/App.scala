package com.quantifind.kafka


/**
 * Hello world!
 *
 */
object App extends App {
  println( "Hello World!" )
  Seq("TERM", "HUP", "INT").foreach { sig =>
    App.register(sig) {
      println("RECEIVED SIGNAL " + sig)
      false
    }
  }

  def register(signal: String)(action: => Boolean): Unit = synchronized {
      try {
          println("Registered signal handler for " + signal)
          println("=========="+action)
        //          true
//        handler.register(action)
      } catch {
        case ex: Exception => println(s"Failed to register signal handler for " + signal)
      }
    }
}
