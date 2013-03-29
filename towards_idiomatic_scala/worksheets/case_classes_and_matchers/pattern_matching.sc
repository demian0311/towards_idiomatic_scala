object pattern_matching {

  // you can match on constants
  val foo = 1                                     //> foo  : Int = 1
  foo match {
    case 0 => "this is a zero"
    case 1 => "this is a one"
    case _      => "dunno" // don't want a MatchError
  }                                               //> res0: java.lang.String = this is a one
  
  val bar = "one"                                 //> bar  : java.lang.String = one
  bar match{
    case "zero" => 0
    case "one"  => 1
    case _      => 0 // don't want a MatchError
  }                                               //> res1: Int = 1

  // you can match on variables
  foo match {
    case something => "well we found something and it was: " + something
  }                                               //> res2: java.lang.String = well we found something and it was: 1
  
  bar match {
    case something => "well we found something and it was: " + something
  }                                               //> res3: java.lang.String = well we found something and it was: one
  
  
  // wildcard pattern
  case class Fruit(name: String, color: String)
  val apple = Fruit("apple", "green")             //> apple  : pattern_matching.Fruit = Fruit(apple,green)
  val banana = Fruit("banana", "yellow")          //> banana  : pattern_matching.Fruit = Fruit(banana,yellow)
  val cherry = Fruit("cherry", "red")             //> cherry  : pattern_matching.Fruit = Fruit(cherry,red)
  
  apple match{
    case Fruit(name, "green") => "found a green fruit named: " + name
    case Fruit(_, "yellow")   => "found a yellow fruit, don't care about the name"
    case _                    => "couldn't find it"
  }                                               //> res4: java.lang.String = found a green fruit named: apple
  
  
}