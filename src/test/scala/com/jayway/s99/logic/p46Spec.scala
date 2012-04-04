package com.jayway.s99.logic

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 *
 * Try to avoid using builtins.  Try to define `not`, `and`, and `or`
 * directly (using pattern matching), and the other functions in terms of those
 * three.
 */
class p46Spec extends FlatSpec with ShouldMatchers {

  import com.jayway.s99.logic.S99Logic._

  "logic not " should "return inverse boolean values"
  com.jayway.s99.logic.S99Logic.not(true) should equal (false)

  "logic not " should "return inverse boolean values"
  com.jayway.s99.logic.S99Logic.not(false) should equal (true)

  "logic and " should "should return true on true true"
    and(true,true) should equal (true)

  "logic and " should "should return false otherwise"
    and(true,false) should equal (false)
    and(false,true) should equal (false)
    and(false,false) should equal (false)

  "logic or " should "should return false on false, false"
    or(false,false) should equal (false)

  "logic or " should "should return true otherwise"
    or(true,false) should equal (true)
    or(false,true) should equal (true)
    or(true, true) should equal (true)


  "logic xor " should "should return false on same"
    xor(false,false) should equal (false)
    xor(true, true) should equal (false)

  "logic xor " should "should return true when different"
    xor(true,false) should equal (true)
    xor(false,true) should equal (true)

  "print table with and " should "give a nice table "
    table2((a: Boolean, b: Boolean) => and(a, or(a, b))) should equal (
        "A     B     result\n" +
        "true  true  true  \n" +
        "true  false true  \n" +
        "false true  false \n" +
        "false false false \n")



}
