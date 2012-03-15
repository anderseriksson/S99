package com.jayway.s99.arithmetic

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p31Spec extends FlatSpec with ShouldMatchers {

  import com.jayway.s99.arithmetic.p31._

  "isPrime" should "check if the integer is prime" in {
    (7 isPrime) should equal(true)
  }
  "isPrime" should "check if the integer is not prime" in {
    (8 isPrime) should equal(false)

  }
}