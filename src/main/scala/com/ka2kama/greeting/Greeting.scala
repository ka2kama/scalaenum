package com.ka2kama.greeting

import com.ka2kama.scalaenum.{IntScalaEnum, IntScalaEnumEntry}

sealed abstract class Greeting(val value: Int, override val displayName: String) extends IntScalaEnumEntry

object Greeting extends IntScalaEnum[Greeting] {

  lazy val values: IndexedSeq[Greeting] = findValues

  case object Hello   extends Greeting(1, "こんにちは")
  case object GoodBye extends Greeting(2, "さようなら")
  case object Hi      extends Greeting(3, "やあ")
  case object Bye     extends Greeting(4, "じゃあね")
}
