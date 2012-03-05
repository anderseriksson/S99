package com.jayway.s99.logic

/**
 * Object named as in original http://aperiodic.net/phil/scala/s-99/logic1.scala
 *
 * This is the implementation used for problem 46 to 50
 */

object S99Logic {

  def not(b: Boolean): Boolean = {
    b match {
    case true => false
    case false => true
    }
  }
}
