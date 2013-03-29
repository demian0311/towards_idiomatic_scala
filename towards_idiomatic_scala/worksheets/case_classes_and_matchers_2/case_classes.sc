package case_classes_and_matchers_2

object case_classes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  sealed abstract class Plant
  case class Vegetable(name: String, color: String) extends Plant
  case class Fruit(name: String, color: String) extends Plant
  
  // no 'new' keyword required
  val asparagus = Vegetable("asparagus", "green") //> asparagus  : case_classes_and_matchers_2.case_classes.Vegetable = Vegetable(
                                                  //| asparagus,green)
  asparagus.hashCode()                            //> res0: Int = -1480619493
                                                 
  val asparagus2 = Vegetable("asparagus", "green")//> asparagus2  : case_classes_and_matchers_2.case_classes.Vegetable = Vegetable
                                                  //| (asparagus,green)
  // toString shows data
  asparagus2                                      //> res1: case_classes_and_matchers_2.case_classes.Vegetable = Vegetable(asparag
                                                  //| us,green)
    
  // hashCode is based on data in case class
  asparagus2.hashCode()                           //> res2: Int = -1480619493
  // equals uses hashCode, same data means they're equal
  asparagus == asparagus2                         //> res3: Boolean = true
                                                  
  val asparagus3 = asparagus2.copy(color="blue")  //> asparagus3  : case_classes_and_matchers_2.case_classes.Vegetable = Vegetable
                                                  //| (asparagus,blue)
  
  //val someFood: Food = Fruit("apple", "green")
  
  val somePlant: Plant = Vegetable("kale", "green")
                                                  //> somePlant  : case_classes_and_matchers_2.case_classes.Plant = Vegetable(kale
                                                  //| ,green)
  // matchers can check types for you using 'constructor patterns'
  somePlant match{
    case Vegetable(_, _) => "vegetables are great"
    case Fruit(_, _) => "fruit is great"
  }                                               //> res4: java.lang.String = vegetables are great
  
  // matchers can check types and values within types and you can use wildcards _
  somePlant match{
    case Vegetable(_, "green") => "green vegetables are even better"
    case Vegetable(_, _) => "vegetables are great"
    case Fruit(_, _) => "fruit is great"
  }                                               //> res5: java.lang.String = green vegetables are even better
  
  // matchers can extract values out of case class instances
  somePlant match{
    case Vegetable(theName, "green") => "green vegetables (like " + theName + ") are even better"
    case Vegetable(_, _) => "vegetables are great"
    case Fruit(_, _) => "fruit is great"
  }                                               //> res6: java.lang.String = green vegetables (like kale) are even better
  
  // pattern guards
  somePlant match{
    case Vegetable(theName, theColor) if (theColor == "green") => "green vegetables (like " + theName + ") are even better"
    case Vegetable(_, _) => "vegetables are great"
    case Fruit(_, _) => "fruit is great"
  }                                               //> res7: java.lang.String = green vegetables (like kale) are even better
  
  
  // typed patterns (you can do this with regular classes)
  somePlant match{
    case v: Vegetable => "vegetables are great"
    case f: Fruit => "fruit is great"
  }                                               //> res8: java.lang.String = vegetables are great
  
  // sealed case classes make sure we cover all options
  def howAboutThisPlant(plant: Plant): String = {
    plant match {
      case Vegetable(_, _) => "vegetables are great"
    }
  }                                               //> howAboutThisPlant: (plant: case_classes_and_matchers_2.case_classes.Plant)S
                                                  //| tring
  val somePlantFruit = Fruit("foo", "bar")        //> somePlantFruit  : case_classes_and_matchers_2.case_classes.Fruit = Fruit(fo
                                                  //| o,bar)
  
  howAboutThisPlant(somePlant)                    //> res9: String = vegetables are great
  howAboutThisPlant(somePlantFruit)               //> scala.MatchError: Fruit(foo,bar) (of class case_classes_and_matchers_2.case
                                                  //| _classes$$anonfun$main$1$Fruit$2)
                                                  //| 	at case_classes_and_matchers_2.case_classes$$anonfun$main$1.howAboutThis
                                                  //| Plant$1(case_classes_and_matchers_2.case_classes.scala:64)
                                                  //| 	at case_classes_and_matchers_2.case_classes$$anonfun$main$1.apply$mcV$sp
                                                  //| (case_classes_and_matchers_2.case_classes.scala:71)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at case_classes_and_matchers_2.case_classes$.main(case_classes_and_match
                                                  //| ers_2.case_classes.scala:3)
                                                  //| 	at case_classes_and_matchers_2.case_classes.main(case_classes_and_matche
                                                  //| rs_2.case_classes.scala)
  
}