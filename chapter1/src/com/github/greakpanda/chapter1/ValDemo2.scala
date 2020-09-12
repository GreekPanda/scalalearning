package com.github.greakpanda.chapter1

/**
 * @author GreekPanda
 * @date 2020/9/12 0012 下午 5:54
 * @version 1.0
 */
object ValDemo2 {

  def main(args: Array[String]): Unit = {
    //create a new class
    //Class's member should be var
    val dog = new Dog
    dog.age = 25
    dog.name = "charlie"

    println(s"${dog.name}'s age is ${dog.age}")
  }
}


class Dog {
  //var can't be val
  var age: Int = 0
  var name: String = ""
}