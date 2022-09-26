

object CountingOccurrenceOfACharacter {
  def main(args: Array[String]) {
        val string = "Learn programming at LMS Portal"
        val count = string.count(_ == 'r')
        println("This string is '" + string + "'")
        println("Count of 'r' in the string :" + count)
    }
}