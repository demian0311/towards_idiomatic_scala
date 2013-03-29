object scala_classes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  abstract class Meat
  class Chicken(name: String) extends Meat
  class Beef(name: String) extends Meat
  
  val chicken = new Chicken("dark")               //> chicken  : scala_classes.Chicken = scala_classes$$anonfun$main$1$Chicken$1@1
                                                  //| 59b5217
  
  chicken.hashCode()                              //> res0: Int = 362500631
  
  // 'new' keyword required
  val chicken2 = new Chicken("dark")              //> chicken2  : scala_classes.Chicken = scala_classes$$anonfun$main$1$Chicken$1@
                                                  //| 82a6f16
  // toString isn't helpful
  chicken2                                        //> res1: scala_classes.Chicken = scala_classes$$anonfun$main$1$Chicken$1@82a6f1
                                                  //| 6
  
  // get a delegated version of hashCode, unique to instance
  chicken2.hashCode()                             //> res2: Int = 136998678
                                                  
  // equals doesn't work as you'd expect, different locations in memory therefore not equal
  chicken == chicken2                             //> res3: Boolean = false
  
  val chicken3 = new Chicken("dark")              //> chicken3  : scala_classes.Chicken = scala_classes$$anonfun$main$1$Chicken$1@
                                                  //| 19e3118a
  val someMeat: Meat = new Beef("steak")          //> someMeat  : scala_classes.Meat = scala_classes$$anonfun$main$1$Beef$1@1d807c
                                                  //| a8
  
  // can't use constructor matchers, you have to use Typed patterns
  // you can also do this with case classes
  someMeat match{
    case b: Beef => "beef is good"
    case c: Chicken => "chicken is good"
  }                                               //> res4: java.lang.String = beef is good
  
  
}