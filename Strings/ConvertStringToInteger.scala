//Program to convert string to integer in Scala

object ConvertStringToInteger {
  def main(args: Array[String]) {
        val string = "12345"
        println(string)
        
        val stringContents = string.split("\\d+")
        
        println("Content of the string are: ")
        
        for(i <- 0 to stringContents.length-1)
            println(stringContents(i))
    }
  
}