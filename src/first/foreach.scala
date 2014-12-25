package first

/**
 * Created by pLacebo on 14. 12. 14..
 */
object foreach{
  def main(args:Array[String]): Unit ={
    println()
    println("foreach 1")
    args.foreach(arg => println(arg))

    println()
    println("foreach 2")
    args.foreach((arg:String) => println(arg))

    println()
    println("foreach 3")
    args.foreach(println)

    println()
    println("foreach 4")
    for(arg <- args)
      println(arg)
  }
}
