//Program to count the total number of characters in the string

object CountTotalNumOfChar {
  def main(args: Array[String]) {
        val string = "Learn programming at LMS Portal"
        val count = string.toCharArray.length
        println("This string is '" + string + "'")
        println("Count of charceters in the string: " + count)
    }
  
}