package scala

/** *
  *
  */
class Point extends DataInterface {

  var x = 1

  var y = 2

  /** *
    * 向map中添加数据
    *
    * @param key
    * @param value
    * @return
    */
  override def put(key: String, value: String): Boolean = {
    try {
      map.put(key, value)
      true
    } catch {
      case e: Exception => println(e)
        false
    }
  }

  /** *
    * 通过键获取值
    *
    * @param key
    * @return
    */
  override def get(key: String): String = {
    map.get(key)
  }
}
