// Scala program to demonstrate the 
// "yield" keyword in "for" loop

object YieldConditionInForLoop {
  def main(args: Array[String]) {  
        var output = for( cnt <- 1 to 5) yield cnt  
        println(output)
    }
}