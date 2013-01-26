object foo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val name = "foo"                                //> name  : java.lang.String = foo
  println("hello " + name)                        //> hello foo
  
  val names = List("demian", "leo", "neidetcher") 
  for(name <- names){
    println("name: " + name)                      
  }
  
  
}