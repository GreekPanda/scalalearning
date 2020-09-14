package com.github.greekpanda.chapter5.exercise

import scala.io.StdIn

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:52
 * @version 1.0
 */
object Excer01 {
  def main(args: Array[String]): Unit = {
    println("输入一个数字")
    val n = StdIn.readInt()
    print99(n)
  }

  //输出99乘法表
  def print99(n: Int): Unit = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%dx%d=%d\t", i, j, j * i)
      }
      println()
    }
  }
}
