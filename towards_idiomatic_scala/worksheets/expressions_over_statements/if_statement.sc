object if_statement {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  def status(age: Int): String = {
    var disposition = "INVALID"
    
    if(age <= 18){
      disposition = "MINOR"
    } else if (age >= 65){
      disposition = "RETIREE"
    } else {
      disposition = "ADULT"
    }
    
    return disposition
  }                                               //> status: (age: Int)String
  
  status(19)                                      //> res0: String = ADULT
  status(1)                                       //> res1: String = MINOR
  status(65)                                      //> res2: String = RETIREE
    
  
  def status2(age: Int): String = {
    if(age <= 18){
      "MINOR"
    } else if (age >= 65){
      "RETIREE"
    } else {
      "ADULT"
    }
  }                                               //> status2: (age: Int)String
  
  status2(19)                                     //> res3: String = ADULT
  status2(1)                                      //> res4: String = MINOR
  status2(65)                                     //> res5: String = RETIREE
  
  if(true) "foo"                                  //> res6: Any = foo
	if(false) "foo"                           //> res7: Any = ()
  if(true) "foo" else "bar"                       //> res8: java.lang.String = foo
  
}