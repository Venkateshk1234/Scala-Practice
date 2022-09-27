
import java.io._
object FileWriter {
  def main(args: Array[String]) {
        val writeFile = new File("text.txt")
        val inputString = "I love programming in Scala"
        val writer = new BufferedWriter(new FileWriter(writeFile))
        writer.write(inputString)
        writer.close()
    }
}