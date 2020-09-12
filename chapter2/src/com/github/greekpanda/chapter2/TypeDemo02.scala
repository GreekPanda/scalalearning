package com.github.greekpanda.chapter2

/**
 * @author GreekPanda
 * @date 2020/9/12 0012 下午 6:13
 * @version 1.0
 */
object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHi())
  }

  def sayHi(): Nothing = {
    throw new RuntimeException("Error when say hi")
  }
}
