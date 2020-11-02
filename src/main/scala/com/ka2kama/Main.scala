package com.ka2kama

import com.ka2kama.scalaenum.ScalaEnumEntryBase._

object Main extends App {

  println(ShirtSize.values)
  println(ShirtSize.size)
  println(ShirtSize.Small.name)
  println(ShirtSize.Small.displayName)
  println((ShirtSize.Medium: ShirtSize).ordinal)
  println(ShirtSize.indexOf(ShirtSize.Medium))
  println(ShirtSize.withName(ShirtSize.Large.toString))
  println(ShirtSize.withNameOption(ShirtSize.Large.toString))

  println(DayOfWeek.values)
  println(DayOfWeek.size)
  println(DayOfWeek.Sunday.name)
  println(DayOfWeek.Sunday.displayName)
  val mon: DayOfWeek = DayOfWeek.Monday
  println(mon.ordinal)
  println(DayOfWeek.indexOf(DayOfWeek.Tuesday))
  println(DayOfWeek.withName(DayOfWeek.Tuesday.toString))
  println(DayOfWeek.withNameOption(DayOfWeek.Tuesday.toString))
  println(DayOfWeek.Monday.value)
  println(DayOfWeek.withValue(DayOfWeek.Monday.value))
  println(DayOfWeek.withValueOpt(DayOfWeek.Monday.value))
}
