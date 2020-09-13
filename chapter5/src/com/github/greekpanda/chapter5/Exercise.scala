package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 2:26
 * @version 1.0
 */
object Exercise {

  def main(args: Array[String]): Unit = {
    val n = 10
    val ret = fib(n)
    println(s"result is ${ret}")

    println("------------------------")
    val ret1 = getRes(10)
    println(s"ret1 is ${ret1}")

    println("------------------------")

    val ret2 = monkeyEatPeachs(1)
    println(s"ret2 is ${ret2}")
  }

  def fib(n: Int): Int = {
    if (n == 0) {
      0
    } else if (n == 1 || n == 2) {
      1
    } else {
      fib(n - 1) + fib(n - 2)
    }
  }

  def getRes(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * getRes(n - 1) + 1
    }
  }

  def monkeyEatPeachs(n: Int): Int = {
    if (n == 10) {
      1
    } else {
      (monkeyEatPeachs(n + 1) + 1) * 2
    }
  }
}
