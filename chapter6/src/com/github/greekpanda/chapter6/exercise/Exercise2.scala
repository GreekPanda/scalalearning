package com.github.greekpanda.chapter6.exercise

/**
 *
 * 计算字符串中所有的unicode
 *
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 4:52
 * @version 1.0
 */
object Exercise2 {
  def main(args: Array[String]): Unit = {
    val s: String = "hello"
    stringToUnicode1(s)
    println("\n---------------------------")
    string2Unicode(s)
    println("\n---------------------------")
    stringToUnicode1(s)
  }

  def stringToUnicode1(s: String): Unit = {
    var ret: Long = 1L
    for (i <- s) {
      ret *= i.toLong
    }
    print("ret = " + ret)
  }

  def string2Unicode(s: String): Unit = {
    var ret = 1L
    s.foreach(ret *= _.toLong)
    println("ret = " + ret)
  }

  def string2Unicode2(s: String): Unit = {
    var ret = 1L
    for (i <- s) {
      ret *= s.toLong
    }
    println("ret = " + ret)
  }

}
