
import scala.io.Source
object ReadingContentLineByLine {
  def main(args:Array[String]){
        //file name
        val filename = "myfile.txt"  
        
        //file reading - creating object name by passing
        //filename i.e. file object
        val filereader = Source.fromFile(filename)  
        //printing characters
        for(line<-filereader.getLines){  
            println(line)  
        }   
        //closing
        filereader.close()  
    } 
}