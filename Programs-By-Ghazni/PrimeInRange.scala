//Write a program to print all the prime numbers between two given numbers by creating a function.

object PrimeInRange {
  def main(args: Array[String]) = 
 {
    println("Enter The Given Numbers.")
    var n1=scala.io.StdIn.readInt()
    var n2=scala.io.StdIn.readInt()
    for(i <- n1 to n2)
    {
      var flag = 0
      //println("entr for loop1")
      for(j<-2 to i-1)
      {
        if(i%j==0)
          flag = 1
          
      }    
      if(flag == 0)
        println("No. is prime no."+i)
    }
 }
}