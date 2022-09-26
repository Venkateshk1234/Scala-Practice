// Scala program to demonstrate "for" loop 
// to print numbers from 1 to 10

object PrintNumsFrom1to10_UseForloop {
  def main(args: Array[String]) {  
        for( cnt <- 1 to 10 )
        {
            printf("%d ",cnt);
        }
        println()
    }
}