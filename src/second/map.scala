/**
 * Created by pLacebo on 14. 12. 25..
 */

object map {
  def main (args: Array[String]) {
    val remanNumeral = Map (
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(remanNumeral(4))

    import scala.collection.mutable.Map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    print(treasureMap(2))

  }
}