//Program to split a string in Scala

object SplitAString {
  def main(args: Array[String]) {
        val string = "Hello! Welcome to Affine Analytics..."
        println(string)
        
        val stringContents = string.split(" ")
        
        println("Content of the string are: ")
        
        for(i <- 0 to stringContents.length-1)
            println(stringContents(i))
    }
}