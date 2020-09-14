package com.github.greekpanda.chapter6

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:59
 * @version 1.0
 */
object ObjectDemo1 {
  def main(args: Array[String]): Unit = {
    val t = new TestClass
    t.age = 19
    t.sex = 0
    t.name = "Tom"

    println(t.toString)
    println("name: " + t.name + "\t" + " age: " + t.age + "\t" + " sex: " + t.sex)
  }
}


class TestClass {
  //默认就是private成员，同时会成成两个public getter和setter方法
  //如果不想指定初始值，就是使用下划线_
  var name: String = "test"
  var age: Int = _
  var sex: Byte = _
}