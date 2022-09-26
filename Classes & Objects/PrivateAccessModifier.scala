// Scala program to demonstrate the
// "private" access modifier

class Demo {
  private var num: Int = 10
  def printNum() {
    printf("Num: %d\n", num);
  }
}

object PrivateAccessModifier {
  def main(args: Array[String]) {
    var obj = new Demo();

    // This statement will generate an error because
    // private members cannot access outside the class.
    // obj.num=20;

    obj.printNum();
  }
}