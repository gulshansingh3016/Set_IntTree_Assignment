package com.knoldus.Tree

object IntegerTreeRun {
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(t: IntTree, v: Int): Boolean = t match {
    case EmptyTree => false
    case Node(e, l, r) =>
      if (v < e) contains(l, v)
      else if (v > e) contains(r, v)
      else true
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case EmptyTree => Node(v, EmptyTree, EmptyTree)
    case Node(e, l, r) =>
      if (v < e) Node(e, insert(l, v), r)
      else if (v > e) Node(e, l, insert(r, v))
      else t
  }

  def main(args: Array[String]) {
    val t = insert(insert(insert(insert(insert(EmptyTree, 12), 14), 19), 18), 28)
    println("Integer Tree is: " + t)
    println("Is Tree contains 28?: " )
    if (contains(t, 28))
      println("Yes")
    else
      println("No")
    println("Is Integer Tree contains 17?: ")
    if (contains(t, 17))
      println("Yes")
    else
      println("No")
  }
}