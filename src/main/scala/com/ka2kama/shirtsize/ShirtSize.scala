package com.ka2kama.shirtsize

import com.ka2kama.scalaenum.{ScalaEnum, ScalaEnumEntry}

sealed trait ShirtSize extends ScalaEnumEntry
object ShirtSize extends ScalaEnum[ShirtSize] {
  case object Small  extends ShirtSize
  case object Medium extends ShirtSize
  case object Large  extends ShirtSize

  lazy val values: IndexedSeq[ShirtSize] = findValues
}
