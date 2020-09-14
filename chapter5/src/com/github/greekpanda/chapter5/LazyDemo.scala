package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:26
 * @version 1.0
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    lazy val ret = sum(10, 20)
    println("----->11111")
    println(s"result is ${ret}")
  }

  def sum(n1: Int, n2: Int): Int = {
    println("----->222222")
    return n1 + n2
  }
}
