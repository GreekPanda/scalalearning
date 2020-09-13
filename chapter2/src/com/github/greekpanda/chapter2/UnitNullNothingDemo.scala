package com.github.greekpanda.chapter2

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 上午 10:52
 * @version 1.0
 */
object UnitNullNothingDemo {
  def main(args: Array[String]): Unit = {
    val res = sayHello();
    println("res=" + res)

    val dog : Dog = null

    //此处会有error，不允许将控制赋给基本类型，智能赋值给对象
//    val c1: char = null

    println("Good")

  }

  def sayHello():Unit = {
    100
  }
}

class Dog {

}
