package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:33
 * @version 1.0
 */
object ExceptionDemo {
  def main(args: Array[String]): Unit = {
    try {
      val ret = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        println("除数为0！")
      }
      case ex: Exception => {
        println("出现异常")
      }
      case ex: RuntimeException => {
        println("运行时异常")
      }
    } finally {
      //不管是否异常，finally肯定要执行
      println("Finally肯定要执行")
    }

    println("流程继续执行")

  }
}
