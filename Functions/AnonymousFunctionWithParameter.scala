

object AnonymousFunctionWithParameter {
  def main(args: Array[String])  
    { 
        var mySum1 = (number1 : Int , number2 : Int ) => number1 + number2
        var mySum2 = (_:Int) + (_:Int) 
        println("Anonymous Functions Example Code :")
        println("Sum of 5 and 12 is " + mySum1( 5, 12)) 
        println("Sum of 15 and 21 is " + mySum2( 15, 21)) 
    } 
}