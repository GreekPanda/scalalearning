package com.github.greekpanda.chapter6.exercise

import scala.language.postfixOps

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 4:34
 * @version 1.0
 */
object Exercise1 {
  def main(args: Array[String]): Unit = {
    val t = {} //块表示
    println("t = " + t + "\t" + t.isInstanceOf[Unit])

    //把下面的代码翻译成scala
    //    for(int i = 10; i > 0; i--) {
    //      System.out.println(i)
    //    }


    val list = List(1, 2, 3)
    println(list)
    println(list.reverse)


    //    for (i <- 0 to 10 reverse) {
    //      print(i + "\t")
    //    }

    val n: Int = 20
    printN(n)

    println("\n-----------------------------")

    printN1(n)
  }

  //打印n到0个数字
  def printN(n: Int): Unit = {
    for (i <- 0 to n reverse) {
      print(i + "\t")
    }
  }

  def printN1(n: Int): Unit = {
    //    (0 to n).reverse.foreach(print)
    (0 to n).reverse.foreach(printFormat)
  }


  //自定义输出函数，也可以是其它的函数
  def printFormat(n: Int): Unit = {
    print(n + "\t")
  }
}
