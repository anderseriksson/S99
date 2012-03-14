package com.jayway.s99.binarytrees

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

/**
 *
 */
class p55Spec extends FlatSpec with ShouldMatchers {

  import com.jayway.s99.binarytrees.Tree._

  "logic not " should "return inverse boolean values"
    cBalanced(4, "x") should
      equal("(T(x T(x . .) T(x . T(x . .))), T(x T(x . T(x . .)) T(x . .)), T(x T(x . .) T(x T(x . .) .)), T(x T(x T(x . .) .) T(x . .)))")


    //TODO investigate    Node  and Tree ???


}
