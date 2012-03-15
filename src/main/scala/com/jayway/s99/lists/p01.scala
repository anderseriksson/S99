package com.jayway.s99.lists

/**
 * @author Amir Moulavi
 * Problem 1: Find the last element of a list.
 *
 * Variants: use built in convenience methods or use recursion
 *
 */


object p01 {
  def last[T](l: List[T]): T = {
    l.last
  }
}
