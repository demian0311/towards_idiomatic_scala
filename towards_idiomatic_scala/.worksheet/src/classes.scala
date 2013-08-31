object classes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet")
  
  case class Fruit(name: String, var color: String);$skip(92); 
  
  val f = new Fruit("foo", "bar");System.out.println("""f  : classes.Fruit = """ + $show(f ));$skip(30); 
  val b = f.copy(color="red");System.out.println("""b  : classes.Fruit = """ + $show(b ));$skip(95); val res$0 = 
  
  "one" match {
  		case "zero" => Some(0)
  		case "one" => Some(1)
  		case _ => None
  };System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(105); 
  


	def fizzBuzz(n: Int) = n + ":" + (if(n % 3 == 0) "fizz" else "") + (if(n % 5 == 0) "buzz" else "");System.out.println("""fizzBuzz: (n: Int)java.lang.String""");$skip(44); val res$1 = 

	(1 to 20) map {fizzBuzz(_)} mkString "\n";System.out.println("""res1: String = """ + $show(res$1));$skip(130); 
  
  
  def defineNumber(num: Int): String = {
  		num match {
  			case x if x % 2 == 0 => "even"
  			case _ => "odd"
  		}
  };System.out.println("""defineNumber: (num: Int)String""");$skip(21); val res$2 = 
  
  defineNumber(5);System.out.println("""res2: String = """ + $show(res$2))}
  
}