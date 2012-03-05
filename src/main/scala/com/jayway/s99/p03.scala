package com.jayway.s99

/**
* @author Amir Moulavi
* Problem 3: Find the Kth element of a list.
*
*/

import scala.annotation.unchecked

//todo What is the intention for n > the list length... exception of last element?

object p03 {
        def nth[A](n:Int, list:List[A]):A = (list : @unchecked) match {
                case head :: Nil => head
                case head :: tail => if (n == 0) head else nth(n-1, tail)
        }
        
//        http://aperiodic.net/phil/scala/s-99/p03.scala
  // Trivial with builtins.
  def nthBuiltin[A](n: Int, ls: List[A]): A =
    if (n >= 0) ls(n)
    else throw new NoSuchElementException

  // Not that much harder without.
  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }        
        
}
