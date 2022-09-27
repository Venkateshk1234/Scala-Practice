

object FunctionsWithNamedArguments {
  def sub( a:Int, b:Int ) = {
      println("Substraction = " + (a-b) );
   }
   def main(args: Array[String]) {
             println("The fucntion is called using named function call")
             sub(b = 5, a = 7);
   }
}