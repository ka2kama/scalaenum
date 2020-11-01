package com.ka2kama

import com.ka2kama.greeting.Greeting
import com.ka2kama.scalaenum.ScalaEnumEntryBase._
import com.ka2kama.shirtsize.ShirtSize

object Main extends App {

  println(ShirtSize.Small.name)
  println(ShirtSize.Small.displayName)
  println((ShirtSize.Medium: ShirtSize).ordinal)
  println(ShirtSize.indexOf(ShirtSize.Medium))
  println(ShirtSize.withName(ShirtSize.Large.toString))
  println(ShirtSize.withNameOption(ShirtSize.Large.toString))

  println(Greeting.Hello.displayName)
  val gr: Greeting = Greeting.GoodBye
  println(gr.ordinal)
  println(gr.in(Seq(Greeting.Bye)))
  println(Greeting.GoodBye.value)
  println(Greeting.size)
  println(Greeting.indexOf(Greeting.Hello))
  println(Greeting.withName(Greeting.Hello.toString))
  println(Greeting.withValue(Greeting.GoodBye.value))
  println(Greeting.withValueOpt(Greeting.GoodBye.value))
}
