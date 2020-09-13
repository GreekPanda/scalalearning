package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 3:23
 * @version 1.0
 */
object Details {
  def main(args: Array[String]): Unit = {
    val t1 = new Test
    //val t0 = test2(100)
    val t2 = test1(100, t1)
    println(s"t1's name ${t1.name}" + s"t2's name ${t2.name}")
    println(s"t1 hascode ${t1.hashCode()}" + s"t2's hashcode ${t2.hashCode()}")


  }

  def test1(n: Int, t: Test): Test = {
    // java.lang.NoSuchMethodError: ???
    println(s"n is ${n}")
    t.name = "hello"
    t
  }

  //如果有显示的return返回值得类型也必须是确定的
  def test2(n: Int): Int = {
    return n
  }

  //如果没有任何返回值，表示该函数没有返回值，此处的return是无效的
  def test3() {
    return 100
  }

  //如果返回值得类型时unit，此处使用return无效
  def test4(): Unit = {
    return 100 + 100
  }

  //如果没有返回值或者返回值的类型确定，可以返回any或者不用类型
  def test5(): Any= {
    return 100
  }
}

class Test {
  var name = ""
}