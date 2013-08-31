object matchers2 {

	// match literals
	1 match {
		case 0 => "zero"
		case 1 => "one"
		case _ => "unknown"
	}

	// match tuples
	("Alice", 5) match {
		case (name, 5) => "found a 5 with name: " + name
		case _ => "found nothing"
	}
	
	// match types
	val oneInt: Any = 1
	oneInt match {
		case i: Int => "Int: " + i
		case s: String => "String: " + s
		case u => "Unknown: " + u
	}
	
	// if statements
	1 match {
		case i if i > 0 => "Positive Int: " + i
		case i if i < 0 => "Negative Int"
		case _ => "Zero"
	}
	
	// sequences
	List("Alice", "Bob", "Charlie") match {
		case List("Alice", b, c) => c + " is with Alice"
		case _ => "Alice is not in list"
	}

	// sequences
	List("Alice", "Bob", "Charlie") match {
		case "Alice" :: tail => tail + " is with Alice"
		case _ => "Alice is not in list"
	}
	
	
	
	
	
}