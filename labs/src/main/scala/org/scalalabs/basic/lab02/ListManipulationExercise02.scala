package org.scalalabs.basic.lab02

import scala.collection.mutable.ListBuffer
 import sys._


object ListManipulationExercise02 {

  /**
   * Find the maximum element in a list, e.g. maxElementInList(List(1,9,3,5)) == 9
   * As usual, various ways exist: pattern matching, folding, ...
   */
  def maxElementInList(l: List[Int]): Int = {
    l.foldLeft(Int.MinValue)((x: Int, y: Int) => if (x>=y) x else y)
  }

  /**
   * Calculate the sum of the equally position elements
   * of the two list
   */
  def sumOfTwo(l1: List[Int], l2: List[Int]): List[Int] = {
    var l1padded = l1
    var l2padded = l2
    if (l1.length < l2.length) {
      l1padded = l1.padTo(l2.length, 0)
    } else {
      l2padded = l2.padTo(l1.length, 0)
    }
    
    l1padded.zip(l2padded).map((t: (Int, Int)) => t._1+t._2) 
  }

  /**
   *  For this exercise preferably make use of the sumOfTwo
   * method above
   */
  def sumOfMany(l: List[Int]*): List[Int] = {
    l.foldLeft(List[Int]())((x:List[Int], y:List[Int]) => sumOfTwo(x, y))
  }

  case class Person(age: Int, firstName: String, lastName: String)

  /**
   * The following method is implemented in the most in-elegant way we could think of.
   * The idea is to re-write the method into more functional style. In the end, you
   * may be able to achieve the same functionality as implemented below
   * in a one-liner.
   */
  def separateTheYoungFromTheOld(persons: List[Person]): List[List[String]] = { 
    var sePersons = persons.sortBy(_.age).partition((person: Person) => person.age < 18)
    List(sePersons._1.map((x: Person) => x.firstName), sePersons._2.map((x: Person) => x.firstName))
  }

}