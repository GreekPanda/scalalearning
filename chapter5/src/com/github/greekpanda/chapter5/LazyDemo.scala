package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:26
 * @version 1.0
 */
object LazyDemo {
  def main(args: Array[String]): Unit = {
    //1. Lazy只能修改val，不能修饰var
    //2. 有lazy修饰的变量，会延迟运行或者加载，只有在真正需要的时候才会出现
    //3. 根据业务逻辑，如果有大量的数据需要分析时，考虑到不需要实时的分析出现，此时可以用lazy进行修改
    lazy val ret = sum(10, 20)
    println("----->11111")
    println(s"result is ${ret}")
  }

  def sum(n1: Int, n2: Int): Int = {
    println("----->222222")
    return n1 + n2
  }
}
