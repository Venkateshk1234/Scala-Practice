//Write a Program to print the Fibonacci sequence of a number.

object Fibonacci {
  def fibonacci(previous1 : Int, previous2 : Int , counter : Int , condition  : Int ){  
   	  print( ", "+(previous1 + previous2))
      if((counter+1) < condition){
          fibonacci(previous2, (previous1 + previous2), (counter+1) , condition)
      }
   }
   def main(args: Array[String]) {
         println("enter nO.")
          var n=scala.io.StdIn.readInt()
          var a = 0
          var b = 1
          println("enter Counter.")
          var counter= scala.io.StdIn.readInt()
         println( "Fibonacci series till " + n+ ": = ")
         print(a + "," + b)
         fibonacci(a,b,counter,n)
   }
}