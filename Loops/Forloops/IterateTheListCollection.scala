// Scala program to iterate the list collection 
// using "for" loop

object IterateTheListCollection {
  def main(args: Array[String]) {  
        var col = List(10,20,30,40,50)         
        for( v <- col){                         
            printf("%d ", v)  
        }  
        println()
    }
}