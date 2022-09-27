//Print Factorial of a number using Recursion in Scala

object FactorialUsingRecursive {
  def factorial(n: BigInt): BigInt = {  
      if (n == 1)
         1  
      else    
            n * factorial(n - 1)
   }
   def main(args: Array[String]) {
         println( "Factorial of " + 25 + ": = " + factorial(25) )
   }
}