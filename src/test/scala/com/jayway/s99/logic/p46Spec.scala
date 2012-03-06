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

  "logic and " should "should return true on true true"
    com.jayway.s99.logic.S99Logic.and(true,true) should equal (true)

  "logic and " should "should return false otherwise"
    com.jayway.s99.logic.S99Logic.and(true,false) should equal (false)
    com.jayway.s99.logic.S99Logic.and(false,true) should equal (false)
    com.jayway.s99.logic.S99Logic.and(false,false) should equal (false)


}
