object matchers2 {

	// match literals
	1 match {
		case 0 => "zero"
		case 1 => "one"
		case _ => "unknown"
	}                                         //> res0: java.lang.String = one

	// match tuples
	("Alice", 5) match {
		case (name, 5) => "found a 5 with name: " + name
		case _ => "found nothing"
	}                                         //> res1: java.lang.String = found a 5 with name: Alice
	
	// match types
	val oneInt: Any = 1                       //> oneInt  : Any = 1
	oneInt match {
		case i: Int => "Int: " + i
		case s: String => "String: " + s
		case u => "Unknown: " + u
	}                                         //> res2: java.lang.String = Int: 1
	
	// if statements
	1 match {
		case i if i > 0 => "Positive Int: " + i
		case i if i < 0 => "Negative Int"
		case _ => "Zero"
	}                                         //> res3: java.lang.String = Positive Int: 1
	
	// sequences
	List("Alice", "Bob", "Charlie") match {
		case List("Alice", b, c) => c + " is with Alice"
		case _ => "Alice is not in list"
	}                                         //> res4: java.lang.String = Charlie is with Alice

	// sequences
	List("Alice", "Bob", "Charlie") match {
		case "Alice" :: tail => tail + " is with Alice"
		case _ => "Alice is not in list"
	}                                         //> res5: java.lang.String = List(Bob, Charlie) is with Alice
}