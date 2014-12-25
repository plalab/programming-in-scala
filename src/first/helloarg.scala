package first

/**
 * Created by pLacebo on 14. 12. 14..
 */
object helloarg {
  def main(args:Array[String]): Unit = {
    println("Hello, " + args(0) + "!");
  }
}