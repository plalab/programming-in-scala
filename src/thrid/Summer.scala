/**
 * Created by pLacebo on 14. 12. 29..
 */
import thrid.ChecksumAccumulator.calculate

object Summer {
  def main (args: Array[String]) {
    for(arg <- args)
      println(arg + ": "+ calculate(arg))
  }
}
