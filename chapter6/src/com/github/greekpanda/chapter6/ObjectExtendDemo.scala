package com.github.greekpanda.chapter6

/**
 * @author GreekPanda
 * @date 2020/9/14 0014 下午 4:19
 * @version 1.0
 */
object ObjectExtendDemo {
  def main(args: Array[String]): Unit = {

    val father = new Father
    val son: Father = new Son

  }
}


class Father {

}

class Son extends Father {

}


class Grandson extends Son {

}
