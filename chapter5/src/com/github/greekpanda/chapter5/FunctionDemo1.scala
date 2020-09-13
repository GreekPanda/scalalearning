package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 1:27
 * @version 1.0
 */
object FunctionDemo1 {
  def main(args: Array[String]): Unit = {
    val sum = getRes(10, 20, '+')
    println(s"Sum is ${sum}")

    val sub = getRes(100, 200, '-')
    println(s"Sub is ${sub}")

    val mul = getRes(10, 8, '*')
    println(s"Mul is ${mul}")

    val div = getRes(180, 9, '/')
    println(s"div is ${div}")

    val nul = getRes(100, 100, '%')
    println(s"result is ${nul}")

    //此处如果抛出异常之后，无法继续往下执行
    val divZero = getRes(100, 0, '/')
    println(s"div zero ${divZero}")
  }

  //由于需要返回空值，所以不需要指定返回值
  def getRes(num1: Int, num2: Int, op: Char) = {
    if (op == '+') {
      num1 + num2
    } else if (op == '-') {
      num1 - num2
    } else if (op == '*') {
      num1 * num2
    } else if (op == '/') {
      if (num2 == 0) {
        throw new RuntimeException("Num2 can't be zero")
      }
      num1 / num2
    } else {
      null
    }
  }
}
