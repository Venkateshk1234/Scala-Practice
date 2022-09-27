//Program to show implementation of method overloading in Scala | print data-type of the parameter using method overloading

object MethodOverloadingUsingDataTypes {
   def datatype(x:Int){
        println("The parameter is of Integer datatype")    
    }
    
    def datatype(x:Float){
        println("The parameter is of Float data type")    
    } 
    
    def datatype(x:Char){
        println("The parameter is of Character data type")    
    }
    
    def datatype(x: Boolean){
        println("The parameter is of Boolean data type")    
    }
    
    def main(args: Array[String]) {
        println("Program to print data type using method overloading: ")
        datatype(4)
        datatype(4.0f)
        datatype('f')
        datatype(true)
    }
}