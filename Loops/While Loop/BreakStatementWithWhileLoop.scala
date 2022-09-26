// Scala program to demonstrate "break" statement 
// in "while" loop

// Importing  package 
import scala.util.control.Breaks._
object BreakStatementWithWhileLoop {
  def main(args: Array[String]) {  
        var cnt:Int=0;
        
        cnt=1;
        breakable 
        {
            while(cnt<=5)
            {
                printf("%d ",cnt);
                cnt=cnt+1;
                
                if(cnt==3)
                    break;
            }
        }
        println();
    }
}