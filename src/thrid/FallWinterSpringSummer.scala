/**
 * Created by pLacebo on 14. 12. 29..
 */

import thrid.ChecksumAccumulator.calculate

object FallWinterSpringSummber extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season +": "+ calculate(season))
}