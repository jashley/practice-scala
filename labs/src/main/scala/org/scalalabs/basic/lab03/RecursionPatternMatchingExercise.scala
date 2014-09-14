package org.scalalabs.basic.lab03
import sys._
/**
 * This exercise introduces you to pattern matching in combination with recursion.
 *
 * Recursion is a key concept for the functional style programming.
 * In the exercises below you learn how to apply recursion in combination with Scala's pattern matching facilities.
 *
 * For this exercise exclusively use pattern matching constructs in order to make the corresponding unittest work.
 *
 * Reference material to solve these exercises can be found here:
 * Pattern matching in general: http://programming-scala.labs.oreilly.com/ch03.html#PatternMatching
 * Pattern matching and recursion: http://programming-scala.labs.oreilly.com/ch08.html#Recursion
 */

object RecursionPatternMatchingExercise {

  /**
   * ***********************************************************************
   * Recursive algorithms with pattern matching
   * For expected solution see unittest @RecursionPatternMatchingExerciseTest
   * ***********************************************************************
   */
  /**
   * Create a method that checks that each subsequent value is greater than
   * the previous one.
   * E.g.:
   * checkValuesIncrease(Seq(1,2,3)) == true
   * checkValuesIncrease(Seq(1,2,2)) == false
   */
  def checkValuesIncrease(seq: Seq[Int]): Boolean = {
    if (seq.length < 2) true
    else if (seq(0) < seq(1)) checkValuesIncrease(seq.tail)
    else false
  }
  
  /**
   * Group Consecutive values
   * List(1,1,2,3,1,1) -> List(1,1), List(2), List(3), List(1,1)
   */
  def tailGroupConsecutive[T](acc: List[List[T]], in: List[T]): List[List[T]] = {
    if (in.isEmpty) acc
    else if (acc.isEmpty || !acc.last.contains(in.head)) {
      tailGroupConsecutive(acc ++ List(List(in.head)), in.tail)
    }
    else {
      val newAcc = acc.init ++ List(acc.last ++ List(in.head))
      tailGroupConsecutive(newAcc, in.tail)
    }
  }
  
  def groupConsecutive[T](in: List[T]): List[List[T]] = {
    tailGroupConsecutive(List[List[T]](), in)
  }

  /**
   * Group Equal values
   * List(1,1,2,3,1,1) -> List(1,1,1,1), List(2), List(3)
   */
  def placeInGroup[T](acc: List[List[T]], elem: T): List[List[T]] = {
    if (acc.isEmpty) List(List(elem))
    else if (acc.head.contains(elem)) List((acc.head ++ List(elem))) ++ acc.tail
    else List(acc.head) ++ placeInGroup(acc.tail, elem)
  }
  
  def tailGroupEquals[T](acc: List[List[T]], in: List[T]): List[List[T]] = {
    if (in.isEmpty) acc
    else tailGroupEquals(placeInGroup(acc, in.head), in.tail)
  }
  
  def groupEquals[T](in: List[T]): List[List[T]] = {
    tailGroupEquals(List[List[T]](), in)
  }

  /**
   * Compress values
   * List(1,1,2,3,1,1) -> List(1,2,3)
   */
  def tailCompress[T](acc: List[T], in: List[T]): List[T] = {
    if (in.isEmpty) acc
    else if (acc.contains(in.head)) tailCompress(acc, in.tail)
    else tailCompress(acc ++ List(in.head), in.tail)
  }
  
  def compress[T](in: List[T]): List[T] = {
    tailCompress(List[T](), in)
  }
  
  /**
   * Define the amount of all equal members
   * List(1,1,2,3,1,1) -> List((4,1),(1,2),(1,3))
   */
  def amountEqualMembers[T](in: List[T]): List[(Int, T)] = {
    groupEquals(in).map((l: List[T]) => (l.length, l.head))
  }
  
  /**
   * Zip multiple lists
   * List(List(1,2,3), List('A, 'B, 'C), List('a, 'b, 'c)) -> List(List(1, 'A, 'a), List(2, 'B, 'b), List(3, 'C, 'c))
   */
  def tailZipMultiple(acc: List[List[_]], in: List[List[_]]): List[List[_]] = {
    if (in.isEmpty || in.head.isEmpty) acc
    else {
      val newAcc = acc ++ List(in.map((l: List[_]) => l.head))
      val newIn = in.map((l: List[_]) => l.tail)
      tailZipMultiple(newAcc, newIn)
    }
  }
  
  def zipMultiple(in: List[List[_]]): List[List[_]] = {
    tailZipMultiple(List[List[_]](), in)
  }

  /**
   * Zip multiple lists with different sizes
   * List(List(1), List('A, 'B, 'C), List('a, 'b)) -> List(List(1, 'A, 'a))
   */
  def tailZipMultipleDiff(acc: List[List[_]], in: List[List[_]]): List[List[_]] = {
    if (in.isEmpty || in.map((l:List[_]) => l.isEmpty).contains(true)) acc
    else {
      val newAcc = acc ++ List(in.map((l: List[_]) => l.head))
      val newIn = in.map((l: List[_]) => l.tail)
      tailZipMultipleDiff(newAcc, newIn)
    }
  }
  
  def zipMultipleWithDifferentSize(in: List[List[_]]): List[List[_]] = {
    tailZipMultipleDiff(List[List[_]](), in)
  }

}
