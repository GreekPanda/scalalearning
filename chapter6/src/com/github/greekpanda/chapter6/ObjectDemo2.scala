package com.github.greekpanda.chapter6

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 2:20
 * @version 1.0
 */
object ObjectDemo2 {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    val dog = new Dog
    val fish = new Fish

    cat.name = "Tomy"
    cat.age = 2
    cat.color = "gray"

    dog.name = "Doty"
    dog.color = "black"
    dog.age = 3

    fish.name = "Nimo"
    fish.age = 1
    fish.color = "Colorful"

    println("Info : " + "name\t" + "age\t" + "color")
    println("Cat info :" + cat.name + "\t" + cat.age + "\t" + cat.color)
    println("Dog info :" + dog.name + "\t" + dog.age + "\t" + dog.color)
    println("Fish info :" + fish.name + "\t" + fish.age + "\t" + fish.color)
  }
}


class Cat {
  var name: String = "Tom"
  var age: Int = _
  var color: String = _
}

class Dog {
  var name: String = "Dove"
  var age: Int = _
  var color: String = _
}

class Fish {
  var name: String = "Fane"
  var age: Int = _
  var color: String = _
}
