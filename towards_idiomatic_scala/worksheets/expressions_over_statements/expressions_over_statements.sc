object expressions_over_statements {

  val x = 2                                       //> x  : Int = 2
  val a = if(x > 1) "foo" else "bar"              //> a  : java.lang.String = foo
  println("a: " + a)                              //

  def fooBar(x: Int): String = if(x > 1) "foo" else "bar"
    
  


}