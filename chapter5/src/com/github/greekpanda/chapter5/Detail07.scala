package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 6:02
 * @version 1.0
 */
object Detail07 {
  def main(args: Array[String]): Unit = {
    val ret = sum(1, 2, 3, 4, 5, 6, 7, 8)
    println(ret)
  }

  //这样两个函数会出错，因为造成不知道用哪个函数
  //  def sum(args:Int*): Unit = {
  //
  //  }

  def sum(num1: Int, args: Int*): Int = {
    var sum = num1
    for (item <- args) {
      sum += item
    }
    sum
  }

  //可变参数只能在最后一个参数
  //  def sum(args:Int*, num1: Int): Int = {
  //
  //  }
}
