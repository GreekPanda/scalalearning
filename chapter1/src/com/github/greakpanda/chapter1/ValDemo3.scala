package com.github.greakpanda.chapter1

/**
 * @author GreekPanda
 * @date 2020/9/12 0012 下午 6:03
 * @version 1.0
 */
object ValDemo3 {
  //val is like final, can't change the value
  val age:Int = 10
  val name:String= "tom"
  def main(args: Array[String]): Unit = {
    println(s"${name}'s age is ${age}")
  }
}
