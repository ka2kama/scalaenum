package com.ka2kama.scalaenum

import com.ka2kama.SpecBase

class ScalaEnumSpec extends SpecBase {
  "ScalaEnum" - {
    "空のEnumの場合" - {
      "valuesは空を返す" in {
        EmptyEnum.values.size must ===(0)
      }

      "sizeは0を返す" in {
        EmptyEnum.size must ===(0)
      }
    }

    "中身のあるEnumの場合" - {
      "valuesは列挙した順のobjectのIndexedSeqを返す" in {
        val expected = IndexedSeq(DummyEnum.Hello, DummyEnum.GoodBye, DummyEnum.Hi)
        DummyEnum.values must ===(expected)
      }

      "sizeは列挙したobjectの総数を返す" in {
        val expected = IndexedSeq(DummyEnum.Hello, DummyEnum.GoodBye, DummyEnum.Hi).size
        DummyEnum.size must ===(expected)
      }

    }
  }
}
