package com.github.greekpanda.chapter5

/**
 * @author GreekPanda
 * @date 2020/9/13 0013 下午 3:54
 * @version 1.0
 */
object Detail05 {
  def main(args: Array[String]): Unit = {
    //error, 参数不够，正常情况下由左到右推断，如果多个参数类型一样类型，无法推断则报错
//    fun("s1111")
    //显示声明是正确的。
    fun(s2="s222222")
  }

  def fun(s1:String= "s1", s2:String): Unit = {
    println(s1 + " " + s2)
  }
}
