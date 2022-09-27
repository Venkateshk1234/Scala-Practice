

object PartiallyAppliedFunctions {
  def percentage(totalMarks: Int, marksObtained: Int) = {
      println("Percentage Obtianed :");
      println( ((marksObtained*100)/totalMarks) + " %")
   }
   
   def main(args: Array[String]) {
      val  ninth = percentage(350 , _ : Int)
      println("Student 1")
      ninth( 245 )
      println("Student 2")
      ninth( 325 )
      println("Student 3")
      ninth( 102 )
   }   
}