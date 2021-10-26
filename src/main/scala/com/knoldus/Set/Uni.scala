//package com.knoldus.Set
//
//
//
//class Uni {
//  def union(s: Set[Int]): Unit = {
//    def unionhelp(accumulator: Set[Int]): Set[Int] = {
//      if (s.isEmpty) {
//        println("Sets are empty")
//
//      }
//      else {
//      //val set5  =  s ++ accumulator
//        for(set <- s){
//          for(accu <- accumulator){
//          val newset =   s + accu
//          }
//        }
//      }
//
//      union(accumulator)
//    }
//
//
//  }
//
//}
//object SetRun extends App{
//  val a = new Uni
//  val s1: Set[Int]= Set(5,6,7,8,9)
//  val s2: Set[Int]= Set(5,6,7,8,9)
//
//  println(a.union(s1))
//}