
// Scala program to demonstrate "break" statement 
// in "do-while" loop

// Importing  package 
import scala.util.control.Breaks._
object BreakStatementWithDoWhileLoop {
  def main(args: Array[String]) {  
        var cnt:Int=0;
        
        cnt=1;
        breakable 
        {
            do
            {
                printf("%d ",cnt);
                cnt=cnt+1;
                
                if(cnt==3)
                    break;
            }while(cnt<=5)
        }
        println();
    }
}