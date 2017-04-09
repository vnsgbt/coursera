package functionalprinciple.week3abstractiondata

/**
  * Created by steve on 1/19/17.
  */

object Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def contains(x: Int): Boolean = false
  def union(other: IntSet): IntSet = other
}
