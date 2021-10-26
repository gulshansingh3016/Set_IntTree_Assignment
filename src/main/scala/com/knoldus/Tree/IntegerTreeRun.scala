package com.knoldus.Tree

object IntegerTreeRun {
  abstract class IntTree
  case object EmptyTree extends IntTree
  case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree

  def contains(t: IntTree, node: Int): Boolean = t match {
    case EmptyTree => false
    case Node(elem, left, right) =>
      if (node < elem) contains(left, node)
      else if (node > elem) contains(right, node)
      else true
  }

  def insert(tree: IntTree, node: Int): IntTree = tree match {
    case EmptyTree => Node(node, EmptyTree, EmptyTree)
    case Node(e, l, r) =>
      if (node < e) Node(e, insert(l, node), r)
      else if (node > e) Node(e, l, insert(r, node))
      else tree
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