package com.knoldus.typeclassshow

import org.scalatest.funsuite.AnyFunSuite

class TypeClassShowTest extends AnyFunSuite {

  test("Show implementation for Long should return a String representation of Long value") {
    val longValue = 524632L
    assert(TypeClassShow.longShow.show(longValue) == "524632")
  }

  test("Show implementation for Double should return a String representation of Double value") {
    val doubleValue = 3.14245
    assert(TypeClassShow.doubleShow.show(doubleValue) == "3.14245")
  }

  test("Show implementation for Position case class should return a formatted String") {
    val positionValue = TypeClassShow.Position(10, 21)
    assert(TypeClassShow.Position(10,21).positionShow.show(positionValue) == "Pos(x: 10, y: 21)")
  }
}
