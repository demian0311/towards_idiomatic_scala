object sandbox {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val theList: List[Option[String]] = List(
    Some("foo"),
    None,
    Some("bar"),
    None
    )                                             //> theList  : List[Option[String]] = List(Some(foo), None, Some(bar), None)
    
    theList.flatten.mkString(",")                 //> res0: String = foo,bar
  
  
  
  val someString = "Demian"                       //> someString  : java.lang.String = Demian
  val foo = <this name={someString}>that</this>   //> foo  : scala.xml.Elem = <this name="Demian">that</this>
  
  foo                                             //> res1: scala.xml.Elem = <this name="Demian">that</this>
  
}