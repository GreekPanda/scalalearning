package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 1:09
 * @version 1.0
 */
object Method2FunctionDemo {
  def main(args: Array[String]): Unit = {
    val t = new Test
    //正常的类方法调用
    val ret = t.sum(10, 20)
    println(s"sum is ${ret}")

    //将方法修改为函数，添加了_表示此处是一个函数
    val f = t.sum _

    val ret1 = f(50, 90)
    println(s"Sum1 is ${ret1}")

    //函数式编程与Java的Lambda很类似

    //f2是一个函数名称
    //n1 n2为传入参数
    //函数既可以当做变量，也可以传入参数
    val f2 = (n1: Int, n2: Int) => {
      //此为函数体
      n1 + n2
    }

    println(f2)
    println("Sum2 is " + f2(100, 200))

  }


}

class Test {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}