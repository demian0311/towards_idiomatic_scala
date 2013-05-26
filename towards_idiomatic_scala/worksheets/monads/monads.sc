object monads {
		val letters = List("a", "b", "c") //> letters  : List[java.lang.String] = List(a, b, c)
		val numbers = List(1, 2, 3)       //> numbers  : List[Int] = List(1, 2, 3)
		
		letters map {_.toUpperCase}       //> res0: List[java.lang.String] = List(A, B, C)
		
		letters map { l =>
			l.toUpperCase             //> res1: List[java.lang.String] = List(A, B, C)
		}
		
		letters flatMap{
			l => Some(l.toUpperCase)  //> res2: List[java.lang.String] = List(A, B, C)
		}
		
		for {
			l <- letters
			n <- numbers
			if(n % 2 == 0)
		} yield(n + l.toUpperCase())      //> res3: List[String] = List(2A, 2B, 2C)

	// workflow
	// assembly line
	
	// how do you accumulate errors with monads
}