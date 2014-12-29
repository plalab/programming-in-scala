package thrid

/**
 * Created by pLacebo on 14. 12. 29..
 */
class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte) { sum += b }

  def checksum() : Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  import scala.collection.mutable.Map

  private val cache = Map[String, Int]()

  def calculate(s: String) : Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }

  def main (args: Array[String]) : Unit = {
    ChecksumAccumulator.calculate("Every value is an object.")
    println(ChecksumAccumulator.cache)
  }
}
