

object AnonymousFunctionWithoutParameter {
  def main(args: Array[String])  
    { 
        var myfun1 = () => {"Hello! This is Affine Analytics..."} 
        println(myfun1()) 
        def myfunction(fun:(String, String)=> String) = 
        { 
            fun("Hello", "User") 
        } 
        val f1 = myfunction((str1: String, 
                    str2: String) => str1 + str2) 
        val f2 = myfunction(_ + _) 
        println(f1) 
        println(f2) 
    } 
}