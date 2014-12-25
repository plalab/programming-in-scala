package second

/**
 * Created by pLacebo on 14. 12. 22..
 */

object list {
  def main(args:Array[String]): Unit = {
    val oneTwo = List(1,2)
    val threeFour = List(3,4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour +" were not mutated.")
    println("Thus, "+oneTwoThreeFour +" is a new List.")

    val twoThree = List(2,3)
    val oneTwoThree = 1 :: twoThree

    println(oneTwoThree)

    val oneTwoThree2 = 1 :: 2:: 3:: Nil
    println(oneTwoThree2)

    val thrill = "will" :: "fill" :: "until" :: Nil

    println(thrill(2))
    println(thrill.count(s => s.length == 4))
    println(thrill.drop(2))
    println(thrill.dropRight(2))
    println(thrill.exists(s=>s=="until"))
    println(thrill.filter(s=>s.length == 4))
    println(thrill.forall(s=>s.endsWith("l")))
    println(thrill.foreach(s=>print(s)))
    println(thrill.foreach(print))
    println(thrill.head)
    println(thrill.init)
    println(thrill.isEmpty)
    println(thrill.last)
    println(thrill.length)
    println(thrill.map(s=>s +"y"))
    println(thrill.mkString(","))
    //println(thrill.remove(s => s.length ==4))
    println(thrill.reverse)
    //println(thrill.sort((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
    println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower))
    println(thrill.tail)
  }

}