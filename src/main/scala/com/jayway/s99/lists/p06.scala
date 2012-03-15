package com.jayway.s99.lists

/**
 *
 * @author Amir Moulavi
 * Problem 6: Find out whether a list is a palindrome.
 */

object p06 {
  def isPalindrome[T](list: List[T]) = list == list.reverse

  //TODO it is not the best solution but is it possible to write like this?
  // I think it is not the best because the "last" expression in a linked list is ordo (n) by itself
  // that would make the whole thing n2 or so...
  // But it would be better on a list impl with o(0) last method unless the case combination is too
  // expensive...
  def isPalindromeAnders[T](list: List[T]) = list match {
    case Nil => true
    case _ :: Nil => true
    //          case head :: _ :: last => (head == last) && isPalindromeAnders(_)
  }
}
