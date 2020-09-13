package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 3:40
 * @version 1.0
 */
object Detail03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {

    }

    println("-----------------------")

    def f2(): Unit = {
      def f2(): Unit = {
        println("hello --->1")
      }

      println("hello---->2")
    }
  }

  def f2(): Unit = {
    println("hello ----> 3")
  }

}
