package com.github.greekpanda.chapter6

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 4:23
 * @version 1.0
 */
object MemState {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "Tom"
    p.age = 19


    val p2 = p
    println(s"p2 == p is true or false?  " + (p2 == p))
    p.name = "Jack"
    p2.age = 20

    println("P2's name is " + p2.name)

    //赋值之后不影响类的比较
    println(s"After assign p2 == p is true or false?  " + (p2 == p))

    //两个同样的hashcode
    println("p1's hashcode: " + p2.hashCode() + "\t" + "p's hashcode: " + p.hashCode())

  }


}


class Person {
  var name: String = ""
  //有下划线必须有类型
  var age: Int = _
}