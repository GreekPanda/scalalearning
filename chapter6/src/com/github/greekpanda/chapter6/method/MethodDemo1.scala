package com.github.greekpanda.chapter6.method

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 5:23
 * @version 1.0
 */
object MethodDemo1 {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    val ret = cat.cal(10.0, 20.0)
    println(ret)
  }


}

class Cat {
  var name: String = ""
  var weight: Double = _

  def cal(d1: Double, d2: Double): Double = {
    d1 + d2
  }
}
