package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 1:40
 * @version 1.0
 */
object ThrowDemo {
  def main(args: Array[String]): Unit = {

    //val ret = throwTest()
    //println(s"返回信息:${ret}")

    try {
      val ret = throwTest()
    } catch {
      //异常的优先级，应该是具体的异常在前，大的异常在后，实际上不报错，但是无法正确的追溯
      case ex: Exception => println(ex.getMessage)
        println("这里还是可以继续执行")
    }

    //前面已经抛出异常，这句话无法执行，如果需要执行，需要用try catch捕获
    println("是否继续执行")
  }

  def throwTest(): Nothing = {
    throw new RuntimeException("出现异常！")
  }
}
