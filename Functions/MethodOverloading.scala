//Program to show implementation of method overloading in Scala | print area of different figures using method overloading

object MethodOverloading {
  def peri(x:Int, y:Int){
        println("The perimeter of rectangle is "+ (x+y))   
    }
    
    def peri(a:Int , b:Int ,c:Int){
        println("The perimeter of rectangle is "+ (a+b+c))   
    }
    
    def peri(r:Int){
        println("The perimeter of rectangle is "+ (2*(3.14)*r))   
    }
    
    def main(args: Array[String]) {        
        println("Program to print perimeter of different figures using method overloading: ")
        println("Perimeter of rectangle: ")
        peri(12 , 345)
        println("Perimeter of triangle: ")
        peri(3, 5, 8)
        println("Perimeter of circle:")
        peri(4)
    }
}