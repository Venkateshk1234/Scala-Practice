//b. https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

object subarray_index_with_given_sum {
  def main(args: Array[String]) = 
 {
   println("Enter the Number.")
   var n=scala.io.StdIn.readInt()
   var arr = new Array[Int](n)
   println("the values of array is ")
   for (i <- 0 to n-1) 
   {
     arr(i) = scala.io.StdIn.readInt()
   }
   //arr.foreach(println)
   println("enter the target value.")
   var Sum=scala.io.StdIn.readInt()
   for(i <- 0 to arr.length - 1)
   {
     for(j <- 0 to arr.length - 1)
     { 
       if (i != j && arr(i) + arr(j) == Sum)
         println(i,j)
     }
   }
 }
}