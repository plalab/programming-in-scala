/**
 * Created by pLacebo on 14. 12. 29..
 */

object source2 {
  def widthOfLength(s: String) = s.length.toString.length

  def main(args: Array[String]): Unit = {
    import scala.io.Source

    if(args.length > 0) {
      val lines = Source.fromFile(args(0)).getLines().toList
      val longestLine = lines.reduceLeft ((a, b) => if (a.length > b.length) a else b)
      val maxWidth = widthOfLength(longestLine)

      for(line <- lines) {
        val nameSpaces = maxWidth - widthOfLength(line)
        val padding = " " * nameSpaces
        println(padding + line.length +" | " + line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }
}