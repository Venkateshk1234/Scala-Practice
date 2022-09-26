// Scala program to demonstrate the 
// "public" access modifier

class Demo2 {
  // Default access specifier is public.
  var num: Int = 10
  def printNum() {
    printf("Num: %d\n", num);
  }
}

object PublicAccessModifier {
  def main(args: Array[String]) {
    var obj = new Demo2();

    obj.num = 20;

    obj.printNum();
  }
}