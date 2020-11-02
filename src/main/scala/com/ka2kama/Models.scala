package com.ka2kama

import com.ka2kama.scalaenum.{IntScalaEnum, IntScalaEnumEntry, ScalaEnum, ScalaEnumEntry}

sealed trait ShirtSize extends ScalaEnumEntry
object ShirtSize extends ScalaEnum[ShirtSize] {
  case object Small  extends ShirtSize
  case object Medium extends ShirtSize
  case object Large  extends ShirtSize

  lazy val values: IndexedSeq[ShirtSize] = findValues
}

sealed abstract class DayOfWeek(val value: Int, override val displayName: String) extends IntScalaEnumEntry
object DayOfWeek extends IntScalaEnum[DayOfWeek] {
  case object Sunday    extends DayOfWeek(0, "日")
  case object Monday    extends DayOfWeek(1, "月")
  case object Tuesday   extends DayOfWeek(2, "火")
  case object Wednesday extends DayOfWeek(3, "水")
  case object Thursday  extends DayOfWeek(4, "木")
  case object Friday    extends DayOfWeek(5, "金")
  case object Saturday  extends DayOfWeek(6, "土")

  lazy val values: IndexedSeq[DayOfWeek] = findValues
}
