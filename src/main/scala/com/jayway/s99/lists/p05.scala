package com.jayway.s99.lists

/**
 *
 * @author Amir Moulavi
 * Problem 5: Reverse a list.
 */

object p05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case head :: tail => reverse(tail) ::: List(head)
    case _ => Nil

  }
}
