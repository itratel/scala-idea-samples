package scala

import java.util.concurrent.ThreadLocalRandom

object ScalaDemo {

  def main(args: Array[String]): Unit = {
    val point = new Point()
    for (x <- 1 to 10) {
      val value = ThreadLocalRandom.current().nextInt(100)
      point.put(x.toString, value.toString)
    }

    //直接对java的对象遍历
    point.map.forEach((key, value) => {
      println(key, value)
    })
  }
}
