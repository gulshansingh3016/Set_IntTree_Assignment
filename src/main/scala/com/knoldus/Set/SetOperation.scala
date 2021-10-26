package com.knoldus.Set
 class SetUnion{
   def union(set1: Set[Int], set2:Set[Int]): Set[Int] = {
     val set3 = set1 ++ set2
     set3
   }

   def intersection(set1: Set[Int], set2: Set[Int]): Set[Int] = {
     val set3 = set1 & set2
     set3
   }
 }

object run extends App{
  val test = new SetUnion
  val set1: Set[Int] = Set(3, 4, 5, 3, 2, 1)
  val set2: Set[Int] = Set(9, 8, 7, 6, 5, 1)
  println(test.union(set1,set2))
  println(test.intersection(set1,set2))
}