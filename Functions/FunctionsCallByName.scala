//Functions call by name

object FunctionsCallByName {
  def multiply(n : Int) = {
     (14*5);
   }
   def multiplier( t: => Long ) = {
      println("Code to multiply the value by 5")
      println("14 * 5 = " + t)
   }
   def main(args: Array[String]) {
       println("Code to show call by name")
        multiplier(multiply(14))
   }
}