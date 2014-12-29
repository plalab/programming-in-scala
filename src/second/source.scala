/**
 * Created by pLacebo on 14. 12. 29..
 */

object source {
  def main(args: Array[String]): Unit = {
    import scala.io.Source

    if(args.length > 0) {
      for(line <- Source.fromFile(args(0)).getLines())
        println(line.length +"" + line);
    }
    else
      Console.err.println("Please enter filename")
  }
}