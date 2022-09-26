// Scala program to filter the loop counter using 
// "if" condition in "for" loop


object IfconditionInForloop {
  def main(args: Array[String]) {  
        for( cnt <- 1 to 10 if cnt%2==0 )
        {
            printf("%d ",cnt);
        }
        println()
    }
}