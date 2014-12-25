package second

/**
 * Created by pLacebo on 14. 12. 22..
 */

object array {
  def main(args:Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for(i <- 0 to 2)
      print(greetStrings(i))

    val greetStrings2 : Array[String] = new Array[String](3);
    greetStrings2.update(0,"Hello");
    greetStrings2.update(1,", ");
    greetStrings2.update(2,"world!\n");

    for(i <- 0 to 2)
      print(greetStrings2.apply(i))

    val numNames = Array("zero", "one", "two")

    val numNames2 = Array.apply("zero", "one", "two")
  }
}