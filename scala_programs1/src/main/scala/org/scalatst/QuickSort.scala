package org.scalatst

object QuickSort {
  def main(args: Array[String]): Unit = {
    val list1 = List(3,2,4,5,1)
    println("Input list::" + list1)
    val result = sortList(list1)
    println("After sorted ::" + result)
  }

  def sortList(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case head :: tail => sortList(tail.filter(_ < head)) ::: head :: sortList(tail.filter(_ >= head))
  }
}
