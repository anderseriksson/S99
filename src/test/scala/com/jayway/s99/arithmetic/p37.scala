package com.jayway.s99.arithmetic

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p37Spec extends FlatSpec with ShouldMatchers {
  import com.jayway.s99.arithmetic.p37._
  "phi" should "return the phi number of an integer" in {
    phi(315) should equal(144)
  }
}