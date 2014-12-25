/**
 * Created by pLacebo on 14. 12. 25..
 */

object set {
  def main(args: Array[String]): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Leaf"
    println(jetSet.contains("Cessna"))

    import scala.collection.mutable.Set

    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

    import scala.collection.immutable.HashSet
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")
  }
}