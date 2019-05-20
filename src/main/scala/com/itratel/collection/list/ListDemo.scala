package com.itratel.collection.list

import scala.collection.mutable.ListBuffer

object ListDemo {

  def main(args: Array[String]): Unit = {
    testList()
    //testListBuffer()
  }

  /***
    * 测试ListBuffer
    */
  def testListBuffer(): Unit = {
    val listBuffer = new ListBuffer[String]()
    listBuffer.append("d")
    listBuffer.append("e")
    listBuffer.append("f")
    listBuffer.foreach(e => {
      println(e)
    })
  }

  /***
    * 测试List
    * list无法进行添加操作，要想进行添加操作ListBuffer就是了
    */
  def testList(): Unit = {
    val oneList = List("ds", "dsa")
    val twoList = List("wqe", "ewqe")
    println(oneList::: twoList)
    println("dsad" :: twoList)
    println("dsad" :: "dsdsa" :: "dsad" :: Nil)
  }




}
