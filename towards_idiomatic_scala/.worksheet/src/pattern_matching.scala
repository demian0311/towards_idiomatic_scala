object pattern_matching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 

  // you can match on constants
  val foo = 1;System.out.println("""foo  : Int = """ + $show(foo ));$skip(133); val res$0 = 
  foo match {
    case 0 => "this is a zero"
    case 1 => "this is a one"
    case _      => "dunno" // don't want a MatchError
  };System.out.println("""res0: java.lang.String = """ + $show(res$0));$skip(21); 
  
  val bar = "one";System.out.println("""bar  : java.lang.String = """ + $show(bar ));$skip(107); val res$1 = 
  bar match{
    case "zero" => 0
    case "one"  => 1
    case _      => 0 // don't want a MatchError
  };System.out.println("""res1: Int = """ + $show(res$1));$skip(124); val res$2 = 

  // you can match on variables
  foo match {
    case something => "well we found something and it was: " + something
  };System.out.println("""res2: java.lang.String = """ + $show(res$2));$skip(94); val res$3 = 
  
  bar match {
    case something => "well we found something and it was: " + something
  }
  
  
  // wildcard pattern
  case class Fruit(name: String, color: String);System.out.println("""res3: java.lang.String = """ + $show(res$3));$skip(114); 
  val apple = Fruit("apple", "green");System.out.println("""apple  : pattern_matching.Fruit = """ + $show(apple ));$skip(41); 
  val banana = Fruit("banana", "yellow");System.out.println("""banana  : pattern_matching.Fruit = """ + $show(banana ));$skip(38); 
  val cherry = Fruit("cherry", "red");System.out.println("""cherry  : pattern_matching.Fruit = """ + $show(cherry ));$skip(227); val res$4 = 
  
  apple match{
    case Fruit(name, "green") => "found a green fruit named: " + name
    case Fruit(_, "yellow")   => "found a yellow fruit, don't care about the name"
    case _                    => "couldn't find it"
  };System.out.println("""res4: java.lang.String = """ + $show(res$4))}
  
  
}