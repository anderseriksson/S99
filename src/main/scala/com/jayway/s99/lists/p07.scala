package com.jayway.s99.lists

/**
 *
 * @author Amir Moulavi
 * Problem 7: Flatten a nested list structure.
 **/

object p07 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case element: List[_] => flatten(element) //todo don't understand - consider flatMap method above...
    case element => List(element)
  }
}
