package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 3:57
 * @version 1.0
 */
object Detail06 {
  def main(args: Array[String]): Unit = {
    //fun1(10)
    fun2(5)
  }

  //递归不能使用类型推断，必须制定返回的数据类型
  def fun1(n: Int) {
    if (n <= 0) {
      1
    } else {
      fun1(n - 1)
    }
  }

  def fun2(n: Long): Long = {
    if (n <= 1) {
      1
    } else {
      fun2(n - 1)
    }
  }
}
