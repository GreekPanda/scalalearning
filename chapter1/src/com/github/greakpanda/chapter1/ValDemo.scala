package com.github.greakpanda.chapter1

/**
 * @author GreekPanda
 * @date 2020/9/12 0012 下午 5:35
 * @version 1.0
 */
object ValDemo {
  def main(args: Array[String]): Unit = {
    val num1: Int = 10
    val num2: Int = 20
    val sum = num1 + num2
    println("Sum is " + sum)

    val s: String = "hello"
    val d: Double = 0.01
    println("S = " + s + ",\t" + "d is " + d)
    println(s"${s} is ${d}")
  }
}
