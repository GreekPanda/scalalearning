package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:48
 * @version 1.0
 */
object ThrowsDemo {
  def main(args: Array[String]): Unit = {
    val ret = throwsTest()
    println(s"${ret}")
  }

  @throws(classOf[NumberFormatException])
  def throwsTest() {
    "abc".toInt
  }
}
