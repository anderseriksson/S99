package com.jayway.s99.binarytrees

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 *
 */
class p55Spec extends FlatSpec with ShouldMatchers {

  import com.jayway.s99.binarytrees.Tree._
/*
  "balanced tree " should "return inverse boolean values"
    cBalanced(4, "x") should
      equal("List(T(x T(x . .) T(x . T(x . .))), " +
                 "T(x T(x . T(x . .)) T(x . .)), " +
                 "T(x T(x . .) T(x T(x . .) .)), " +
                 "T(x T(x T(x . .) .) T(x . .)))")

  "balanced tree " should "return inverse boolean values"
  cBalanced(2, "a") should
    equal("List(T(a T(a . .) T(a . T(a . .)))")

  "balanced tree " should "return inverse boolean values"
  cBalanced(1, "a") should
    equal("List(T(a . .))")
*/
  "balanced tree of one node " should "one node list"
  cBalanced(1, "a") should
    equal(List(Node("a")))



}
