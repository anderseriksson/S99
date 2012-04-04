package com.jayway.s99.logic

import java.io.{PrintStream, ByteArrayOutputStream, OutputStream, PrintWriter}


/**
 * Object named as in original http://aperiodic.net/phil/scala/s-99/logic1.scala
 *
 * This is the implementation used for problem 46 to 50
 */

object S99Logic {

  def not(b: Boolean): Boolean = {
    b match {
    case true => false
    case false => true
    }
  }
  
  def and(x: Boolean, y: Boolean): Boolean = {
      x && y
  }

  def or(x: Boolean, y: Boolean): Boolean = {
      x || y
  }

  def xor(x: Boolean, y: Boolean): Boolean = {
      x != y
  }

  def table2(f: (Boolean, Boolean) => Boolean): String = {

    val baos = new ByteArrayOutputStream
    val p = new PrintStream(baos)
    
    p.println("A     B     result")
    for {a <- List(true, false);
         b <- List(true, false)} {
//      p.printf("%-5s %-5s %-5s\n", a, b, f(a, b))
      p.printf("%-5s %-5s %-5s ".format(a, b, f(a,b)))
      p.println
    }
    baos.toString
  }

}
