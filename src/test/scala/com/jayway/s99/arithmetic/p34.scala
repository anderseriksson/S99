package com.jayway.s99.arithmetic

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p34Spec extends FlatSpec with ShouldMatchers {
  "totient" should "return the number of comprimes of an integer" in {
    import com.jayway.s99.arithmetic.p34._
    10.totient should equal(4)
  }
}