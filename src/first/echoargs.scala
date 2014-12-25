package first

/**
 * Created by pLacebo on 14. 12. 14..
 */
object echoargs {
  def main(args:Array[String]): Unit = {
    var i = 0
    while(i < args.length) {
      if(i != 0)
        print(" ")
      print(args(i))
      i += 1
    }
    println()
  }
}
