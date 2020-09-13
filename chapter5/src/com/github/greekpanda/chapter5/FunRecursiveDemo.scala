package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 1:46
 * @version 1.0
 */
object FunRecursiveDemo {

  def main(args: Array[String]): Unit = {

    test(4)

    println("---------------------------------1")

    test2(2)

    println("---------------------------------2")

    test2(4)
  }

  def test(n: Int) {
    if (n > 2) {
      //传入的参数如果大于2就一直执行，直到不大于2，然后压入栈中
      test(n - 1)
    }
    println(s"n is ${n}")
  }

  def test2(n: Int) {
    if (n > 2) {
      test2(n - 1)
    } else {
      println(s"n is ${n}")
    }
  }
}
