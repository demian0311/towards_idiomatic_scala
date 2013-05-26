object options_are_monads {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val desert: Option[String] = Some("pie")        //> desert  : Option[String] = Some(pie)

	val bar = for {
		thePie <- desert
	}  yield (thePie)                         //> bar  : Option[String] = Some(pie)
	bar.getOrElse(null)                       //> res0: String = pie


	// map gives you the unwrapped result
	val foo = desert.map{x => x}              //> foo  : Option[String] = Some(pie)
	foo                                       //> res1: Option[String] = Some(pie)
	
	// flatMap keeps it wrapped in a monad
	desert.flatMap(x => Some(x))              //> res2: Option[String] = Some(pie)
  
}