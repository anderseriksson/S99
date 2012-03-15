package com.jayway.s99.arithmetic

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p32Spec extends FlatSpec with ShouldMatchers {
  "gcd" should "return the greatest common divisor of two integers" in {
    import com.jayway.s99.arithmetic.p32._
    gcd(36, 63) should equal(9)
    gcd(5, 17) should equal(1)
    gcd(7, 14) should equal(7)

  }
}