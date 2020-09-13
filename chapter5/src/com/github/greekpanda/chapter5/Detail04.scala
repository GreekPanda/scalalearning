package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 3:47
 * @version 1.0
 */
object Detail04 {
  def main(args: Array[String]): Unit = {
    println(fun("Yes"))
  }

  def fun(name:String="hello"): String = {
    return name + " test"
  }
}
