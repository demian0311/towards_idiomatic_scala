object matchers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(110); val res$0 = 

	// match literals
	1 match {
		case 0 => "zero"
		case 1 => "one"
		case _ => "unknown"
	};System.out.println("""res0: java.lang.String = """ + $show(res$0));$skip(122); val res$1 = 

	// match tuples
	("Alice", 5) match {
		case (name, 5) => "found a 5 with name: " + name
		case _ => "found nothing"
	};System.out.println("""res1: java.lang.String = """ + $show(res$1));$skip(39); 
	
	// match types
	val oneInt: Any = 1;System.out.println("""oneInt  : Any = """ + $show(oneInt ));$skip(121); val res$2 = 
	oneInt match {
		case i: Int if i >= 0 => "Int: " + i
		case s: String => "String: " + s
		case u => "Unknown: " + u
	};System.out.println("""res2: java.lang.String = """ + $show(res$2));$skip(146); val res$3 = 
	
	// sequences
	List("Alice", "Bob", "Charlie") match {
		case List("Alice", b, c) => c + " is with Alice"
		case _ => "Alice is not in list"
	};System.out.println("""res3: java.lang.String = """ + $show(res$3));$skip(144); val res$4 = 

	// sequences
	List("Alice", "Bob", "Charlie") match {
		case "Alice" :: tail => tail + " is with Alice"
		case _ => "Alice is not in list"
	};System.out.println("""res4: java.lang.String = """ + $show(res$4))}
}