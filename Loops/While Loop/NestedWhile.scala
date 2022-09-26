// Scala program to demonstrate the 
// nested "while" loop

object NestedWhile {
  def main(args: Array[String]) {  
        var cnt1:Int=0;
        var cnt2:Int=0;
        
        cnt1=2;
        while(cnt1<=5)
        {
            cnt2=1;
            while(cnt2<=10)
            {
                printf("%d ",(cnt1*cnt2));
                cnt2=cnt2+1;
            }
            cnt1=cnt1+1;
            println();
        }
    }
}