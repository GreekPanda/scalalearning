package com.github.greekpanda.chapter2

/**
 * @author GreekPanda
 * @date 2020/9/12 0012 下午 6:07
 * @version 1.0
 */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    val num: Int = 10
    //scala中如果没有形参，括号可以省略
    //scala中所有的类型均是对象
    println(num.toDouble + "\t" + num.toString + "\t" + 1000.toDouble)

    val isPass = true
    println(isPass.toString)

    sayHi();
  }

  def sayHi(): Unit = {
    println("Say hi from a function")
  }
}
