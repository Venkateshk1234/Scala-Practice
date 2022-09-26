// Scala program to demonstrate "do-while" loop 
// to print numbers from 1 to 10

object PrintNumsFrom1to10_UseDoWhile {
  def main(args: Array[String]) {  
        var cnt:Int=0
        
        // Counter variable initialization.
        cnt=1; 
    
        do
        {
            printf("%d ",cnt);
            cnt=cnt+1; //Counter variable updation
        }while(cnt<=10)
        
        println()
    }
}