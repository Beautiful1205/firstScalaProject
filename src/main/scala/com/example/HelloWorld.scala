package com.example

/**
  * @author houxuebo on 2019-04-21 20:38
  **/

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val s = "he"
    println(s)
    val myVar = "Too"
    println(myVar)


    //var a = 0;
    // for 循环
    for (a <- 1 until 4) {
      println("Value of a: " + a);
    }


    //val a = 0
    val list = List(1, 2, 3, 4, 6)
    for (a <- list
         if a > 3) {
      println(a)
    }


    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // for 循环
    var retVal = for {a <- numList
                      if a != 3; if a < 8
    } yield a

    // 输出返回值
    for (a <- retVal) {
      println("Value of a: " + a);
    }


    println("sun = " + addInt(2,3))
  }

  def addInt(a: Int, b: Int): Int = {

    var sum: Int = 0;
    sum = a + b
    return sum

  }
}
