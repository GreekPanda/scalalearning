package com.github.greekpanda.chapter6.classcase

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 5:37
 * @version 1.0
 */
object ClassAndInstanceDemo {

  def main(args: Array[String]): Unit = {
    val dog = new Dog
    dog.name = "jack"
    dog.age = 3
    dog.weight = 11.12

    dog.say()
  }
}

class Dog {
  var name: String = ""
  var age: Int = _
  var weight: Double = _

  def say(): Unit = {
    println("name : " + name + "\t" + "age: " + age + "\tweight :" + weight)
  }
}
