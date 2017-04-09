package functionalprinciple.week3abstractiondata

/**
  * Created by steve on 1/19/17.
  */

class NonEmpty (elem: Int, left: IntSet, right: IntSet) extends IntSet {

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}
