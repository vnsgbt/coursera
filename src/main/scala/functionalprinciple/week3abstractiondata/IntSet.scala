package functionalprinciple.week3abstractiondata

/**
  * Created by steve on 1/19/17.
  */

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}
