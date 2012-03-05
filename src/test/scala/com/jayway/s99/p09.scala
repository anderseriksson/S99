package com.jayway.s99

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class p09Spec extends FlatSpec with ShouldMatchers {
	"pack" should "pack the element of a non-empty list" in {
		p09.pack(List(1,1,1,2,2,2,3,3,3)) should equal (List(List(1,1,1),List(2,2,2),List(3,3,3)))
	}

  "pack" should "pack the element of a non-empty list with sub list in different sizes" in {
    p09.pack(List(1,1,1,1,2,2,2,3)) should equal (List(List(1,1,1,1),List(2,2,2),List(3)))
  }

}
