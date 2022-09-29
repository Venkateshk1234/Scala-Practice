//https://practice.geeksforgeeks.org/problems/reverse-an-array/0

object Reverse_An_Array {
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
   var l = arr.length
   while (l>=0) 
   {
     if(l!=0)
     {
       println(arr(l-1))
       l = l-1
     }
   }
 }
}