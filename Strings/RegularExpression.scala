
//Program to check if a string contains a regular expression

object RegularExpression {
  def main(args: Array[String]) {
        val bike = "Affine Analatics Pvt Ltd 1345"    
        val numRegex = "[0-9]+".r

        println("String: "+bike)

        val matchPattern = numRegex.findFirstIn(bike)

        print("Pattern found "+matchPattern)
    }
}