package scala

import java.util.concurrent.ConcurrentHashMap

trait DataInterface {

  var map = new ConcurrentHashMap[String, String]()

  /***
    * 通过键获取值
    * @param key
    * @return
    */
  def get(key: String): String

  /***
    * 向map中添加数据
    * @param key
    * @param value
    * @return
    */
  def put(key: String, value: String): Boolean

}
