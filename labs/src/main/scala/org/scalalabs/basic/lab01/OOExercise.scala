package org.scalalabs.basic.lab01
import scala.language.implicitConversions
/**
 * The goal of this exercise is to get familiar basic OO constructs in scala


 *
 * Fix the code so that the unit test 'CurrencyExerciseTest' passes.
 *
 * In order for the tests to pass you need to do the following:
 * 
 * Exercise 1:
 * - Create a class Euro
 * - Provide it with two constructor parameters: euro:Int, cents:Int
 * - Provide the cents field with default value: 0
 * - Provide an immutable field named: inCents that converts euro + cents into cents.
 * - Create an object Euro with a factory method named: fromCents that creates an Euro based on cents.
 * - Create a method named: + to the Euro class that adds another Euro
 * - Create a method named: * to the Euro class that multiplies an Euro by an integer
 * 
 * Exercise 2:
 * - Create an abstract class Currency
 * - Provide it with one constructor parameter: symbol:String
 * - Extend the previously created Euro class from Currency
 * - Override the toString method of Euro to represent the following String:
 *   -> symbol + ': ' + euro + ',' + cents.  E.g: EUR 200,05
 * - In case the cents are 0 use this representation:
 *   -> symbol + ': ' + euro + ',--. E.g.: EUR 200,--
 *   
 * OPTIONAL: Exercise 3:
 * - Mix the Ordered trait in Euro
 * - Implement the compare method  
 * 
 * OPTIONAL: Exercise 4:
 * - Provide an implicit class that adds a *(euro:Euro) method to Int
 * - Create a new currency Dollar
 * - Provide a implicit conversion method that converts from Euro to Dollar using the 
 *   [[org.scalalabs.basic.lab01.DefaultCurrencyConverter]]
 * 
 * OPTIONAL: Exercise 5:
 * - Extend the conversion method from Euro to Dollar with an implicit parameter 
 *   of type [[org.scalalabs.basic.lab01.CurrencyConverter]]
 * - Use the implicit CurrencyConverter to do the conversion. 
 */

abstract class Currency(var symbol:String) {}

class Euro(var euro:Int=0, var cents:Int=0) extends Currency("EUR") with Ordered[Euro] {
  
  def inCents: Int = 100*euro + cents
  
  def +(other: Euro): Euro = {
    val badCents = this.cents+other.cents
    val newCents = badCents%100
    val newEuro = badCents/100+this.euro+other.euro
    new Euro(newEuro, newCents)
  }
  
  def *(multiplicand: Int): Euro = {
     new Euro(this.euro*multiplicand) + Euro.fromCents(this.cents*multiplicand)
  }
  
  // We didn't realize we didn't need all of these...
  override def >(other: Euro): Boolean = {
    if (this.euro > other.euro) true
    else if (other.euro > this.euro) false
    else this.cents > other.cents
  }
  
  def ==(other: Euro): Boolean = {
    !(this>other || other>this)
  }
  
  override def <(other: Euro): Boolean = {
    !(this>other || this==other)
  }
  
  override def compare(other: Euro): Int = {
    if (this>other) 1
    else if (other>this) -1
    else 0
  }
  
  override def toString = {
    if (this.cents == 0) {
      this.symbol + ": " + this.euro + ",--"
    } else if (this.cents<10) {
      this.symbol + ": " + this.euro + "," + "0" + this.cents
    } else {
      this.symbol + ": " + this.euro + "," + this.cents
    }
  }
}

object Euro {
  def fromCents(c:Int) = new Euro(c/100,c%100)
}