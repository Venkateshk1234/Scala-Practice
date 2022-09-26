// Scala program to implement the 
// foreach loop

object ListsinForloop {
  def main(args: Array[String]) {  
        var col = List(10,20,30,40,50)
        
        //Print each element  
        col.foreach{  
            print     
        }
        println()
        
        col.foreach(print)  
        println()
        
        col.foreach((item:Int)=>print(item))
        println()
    }
}