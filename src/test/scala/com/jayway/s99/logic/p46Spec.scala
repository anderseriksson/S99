package com.jayway.s99.logic

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 */
class p46Spec extends FlatSpec with ShouldMatchers {

  "logic not " should "return inverse boolean values"
    com.jayway.s99.logic.S99Logic.not(true) should equal (false)

  "logic not " should "return inverse boolean values"
    com.jayway.s99.logic.S99Logic.not(false) should equal (true)
}
