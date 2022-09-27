
import java.io.IOException 
object CatchBlockWorks {
  def main(args:Array[String]) 
	{   
	    var i= 3 
	    var j = 3 
		try{ 
			var N = 5/i - j
			println("the division is successful the value is :" + 5/(i-j))
		} 
		catch{ 
			case  e : ArithmeticException =>{ 
				println("Arithmetic exception occurred.") 
			}
		} 
		finally {
		    println("The finally code that runs in all cases...")
		}
       
	} 
}