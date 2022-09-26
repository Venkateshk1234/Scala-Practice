// Scala program to demonstrate the 
// nested "do-while" loop


object NestedDoWhile {
  def main(args: Array[String]) {  
        var cnt1:Int=0;
        var cnt2:Int=0;
        
        cnt1=2;
        do
        {
            cnt2=1;
            do
            {
                printf("%d ",(cnt1*cnt2));
                cnt2=cnt2+1;
            }while(cnt2<=10)
            
            cnt1=cnt1+1;
            println();
        }while(cnt1<=5)
    }
}