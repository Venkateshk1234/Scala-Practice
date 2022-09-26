//Program to reverse a string in Scala

object ReverseString {
  def reverseString(newString: String): String = {
        var revString = ""
        val n = newString.length()
        for(i <- 0 to n-1){
            revString = revString.concat(newString.charAt(n-i-1).toString)
        }
    return revString
    }
    def main(args: Array[String]) {
        var newString = "Affine Analytics"
        println("Reverse of '" + newString + "' is '" + reverseString(newString) + "'")
    }
}
