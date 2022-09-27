
import java.io.IOException 
object ExceptionHandling {
  def main(args:Array[String]) 
	{   
	    var i= 3 
	    var j = 3 
		try
		{ 
			var N = 5/i - j
			println("The division is successful the value is :" + 5/(i-j))
		} 
		catch
		{ 
			case  e : ArithmeticException =>
			{ 
				println("Arithmetic exception occurred.") 
			}
		} 
       
	} 
}