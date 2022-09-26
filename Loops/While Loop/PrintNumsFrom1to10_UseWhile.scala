// Scala program to implement "while" loop 
// to print numbers from 1 to 10

object PrintNumsFrom1to10_UseWhile {
  def main(args: Array[String]) {  
        var cnt:Int=0
        
        // Counter variable initialization
        cnt=1
        while(cnt<=10)
        {
            printf("%d ",cnt)
            // Counter variable updation
            cnt=cnt+1
        }
        println()
    }
}