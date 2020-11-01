package com.ka2kama.scalaenum

sealed trait EmptyEnum extends ScalaEnumEntry

object EmptyEnum extends ScalaEnum[EmptyEnum] {
  val values: IndexedSeq[EmptyEnum] = findValues
}

sealed trait DummyEnum extends ScalaEnumEntry

object DummyEnum extends ScalaEnum[DummyEnum] {

  val values: IndexedSeq[DummyEnum] = findValues

  case object Hello   extends DummyEnum
  case object GoodBye extends DummyEnum
  case object Hi      extends DummyEnum

}
