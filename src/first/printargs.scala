package first

/**
 * Created by pLacebo on 14. 12. 14..
 */
object printargs {
  def main(args:Array[String]): Unit = {
    var i = 0
    while(i < args.length) {
      println(args(i))
      i += 1
    }
  }
}