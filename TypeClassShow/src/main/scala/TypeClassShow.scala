package com.knoldus.typeclassshow

trait Show[A] {
  def show(a: A): String
}

object TypeClassShow {

  // Implementation of long type
  val longShow: Show[Long] = new Show[Long] {
    def show(number: Long): String = number.toString
  }

  // Implementation of Double Type
  val doubleShow: Show[Double] = new Show[Double] {
    override def show(string: Double): String = string.toString
  }

  // Implementation of Position class type
  case class Position(num1: Int, num2: Int) {
    val positionShow: Show[Position] = new Show[Position] {
      override def show(position: Position): String = s"Pos(x: ${position.num1}, y: ${position.num2})"
    }
  }
}
