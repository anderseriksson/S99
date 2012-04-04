package com.jayway.s99.multiwaytrees

/**
 * Original code http://aperiodic.net/phil/scala/s-99/mtree1.scala
 */
case class MTree[+T](value: T, children: List[MTree[T]]) {
  def this(value: T) = this(value, List())
  override def toString = "M(" + value.toString + " {" + children.map(_.toString).mkString(",") + "})"
}

object MTree {
  def apply[T](value: T) = new MTree(value, List())
//  def apply[T](value: T, children: List[MTree[T]]) = new MTree(value, children)
}
