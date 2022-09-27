

object VariableArguments {
  def printStrings( arguments:String* ) = {
      var i : Int = 0;
      println("The array of arguments recieved is : ")
      for( string <- arguments ){
         println("Arg value[" + i + "] = " + string );
         i = i + 1;
      }
   }
   def main(args: Array[String]) {
      println("This program demonstrate use of variable arguments. ")
      println("first Run :")
      printStrings("Affine", "is", "awesome");
      println("Second Run :")
      printStrings("I", "Love", "programming", "in", "scala");
   }   
}