//Print Fibonacci of a number using Recursion in Scala

object FibonacciUsingRecursive {
  def fibonacci(previous1 : Int, previous2 : Int , counter : Int , condition  : Int ){  
   	  print( ", "+(previous1 + previous2))
      if((counter+1) < condition){
          fibonacci(previous2, (previous1 + previous2), (counter+1) , condition)
      }
   }
   def main(args: Array[String]) {
         println( "Fibonacci series till " + 15 + ": = ")
         print("0 , 1")
         fibonacci(0,1,2,15)
   }
}