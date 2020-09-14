package com.github.greekpanda.chapter6.method

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 5:30
 * @version 1.0
 */
object Exercise1 {
  def main(args: Array[String]): Unit = {
    var rect = new Rect

    rect.printRect()

    rect.longth = 2.2
    rect.width = 6.1

    println("------------------------")

    val ret = rect.sqare()
    println(ret)
  }


}


class Rect {

  var longth: Double = _
  var width: Double = _

  def sqare(): Double = {
    (this.longth * this.width).formatted("%.2f").toDouble
  }

  def printRect(): Unit = {
    for (i <- 0 to 10) {
      for (j <- 0 to 8) {
        print("*")
      }
      println()
    }
  }
}