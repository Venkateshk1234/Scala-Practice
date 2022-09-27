
import java.io._
object FileHandling {
  def main(args:Array[String]){ 
        // creating file object
        val file = new File("myfile.txt" )  
        
        //creating object of the PrintWrite 
        //by passing the reference to the file
        val pw = new PrintWriter(file)  
        
        //writing text to the file
        pw.write("Welcome @ IncludeHelp\n")
        pw.write("writing text to the file\n")
        
        //closing the PrintWriter
        pw.close()    
        println("PrintWriter saved and closed...")
    } 

}