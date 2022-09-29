//Given a array of N positive integers and an integer X. The task is to find the frequency of X in Array.

object FrequencyofX {
  def main(args: Array[String]) = 
 {
   println("Enter the Given Number .")
   var n=scala.io.StdIn.readInt()
   var arr = new Array[Int](n)
   println("the values of array is ")
   for (i <- 0 to n-1) 
   {
     arr(i) = scala.io.StdIn.readInt()
   }
   //arr.foreach(println)
   println("enter x value.")
   var x=scala.io.StdIn.readInt()
   println(arr.filter(_ == x).size)
   }
}