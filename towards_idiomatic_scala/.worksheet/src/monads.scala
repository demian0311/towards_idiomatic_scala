object monads {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(51); 
		val letters = List("a", "b", "c");System.out.println("""letters  : List[java.lang.String] = """ + $show(letters ));$skip(30); 
		val numbers = List(1, 2, 3);System.out.println("""numbers  : List[Int] = """ + $show(numbers ));$skip(33); val res$0 = 
		
		letters map {_.toUpperCase};System.out.println("""res0: List[java.lang.String] = """ + $show(res$0));$skip(41); val res$1 = 
		
		letters map { l =>
			l.toUpperCase
		};System.out.println("""res1: List[java.lang.String] = """ + $show(res$1));$skip(54); val res$2 = 
		
		letters flatMap{
			l => Some(l.toUpperCase)
		};System.out.println("""res2: List[java.lang.String] = """ + $show(res$2));$skip(96); val res$3 = 
		
		for {
			l <- letters
			n <- numbers
			if(n % 2 == 0)
		} yield(n + l.toUpperCase());System.out.println("""res3: List[String] = """ + $show(res$3))}

	// workflow
	// assembly line
	
	// how do you accumulate errors with monads
}