package scala.collection.map

import java.util.concurrent.{ConcurrentHashMap, ThreadLocalRandom}

object MapDemo {

  def main(args: Array[String]): Unit = {

    /**调用java中的集合**/
    val map = new ConcurrentHashMap[String, String](10)
    for (x <- 1 to 10) {
      val value = ThreadLocalRandom.current().nextInt(100)
      map.put(x.toString, value.toString)
    }

    /**
      * scala遍历java中的集合，直接按照在java中的遍历方式就可
      */
    map.forEach((key, value) => {println(key, value)})

    /**-----------------------------------------**/
    val scores = Map("Alice" -> "james", "Bob" -> "mic", "Cindy" -> "tom")

    /**
      * method one
      * case (key: String, value: String) => println(key, value)
      * case (key, value) => println(key, value)
      */
    scores.foreach {
      case (key: String, value: String) => println(key, value)
    }

    /**
      * method two
      * scores.foreach((e: (String, String)) => println(e._1, e._2)) or
      * scores.foreach(e => println(e._1, e._2))
      */
    scores.foreach((e: (String, String)) => println(e._1, e._2))

    /**
      * method three
      */
    scores.foreach(((key: String, value: String) => {
      println(key, value)
    }).tupled)

    /**
      * method four
      */
    for ((key, value) <- scores) {
      println(key, value)
    }
  }

}
