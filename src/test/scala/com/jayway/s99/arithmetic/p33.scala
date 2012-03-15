package com.jayway.s99.arithmetic

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p33Spec extends FlatSpec with ShouldMatchers {
  "coPrime" should "invetigate if two numbers are prime to each other or not" in {
    import com.jayway.s99.arithmetic.p33._
    7.coPrime(14) should equal(false)
    17.coPrime(13) should equal(true)
  }
}