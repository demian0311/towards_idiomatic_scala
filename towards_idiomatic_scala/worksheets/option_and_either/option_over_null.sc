object option_over_null {

  case class Fruit(name: String, color: String)
  
  val a = Fruit("apple", null)                    //> a  : option_over_null.Fruit = Fruit(apple,null)
  
  def isThisGreenFruit(f: Fruit): Boolean = {
    f.color.equals("green")
  }                                               //> isThisGreenFruit: (f: option_over_null.Fruit)Boolean
  
  //isThisGreenFruit(null)
  //isThisGreenFruit(Fruit("", null))

  //
  
  case class Vegetable(name: String, color: Option[String])
  
  
  def isThisGreenVegetable(v: Vegetable): Boolean = {
    v.color.get == "green"
  }                                               //> isThisGreenVegetable: (v: option_over_null.Vegetable)Boolean
  
  
  def isThisGreenVegetable1(v: Vegetable): Boolean = {
    v.color match {
      case Some(value) => value == "green"
      case None => false
    }
  }                                               //> isThisGreenVegetable1: (v: option_over_null.Vegetable)Boolean

  isThisGreenVegetable(Vegetable("asparagus", None))
                                                  //> java.util.NoSuchElementException: None.get
                                                  //| 	at scala.None$.get(Option.scala:274)
                                                  //| 	at scala.None$.get(Option.scala:272)
                                                  //| 	at option_over_null$$anonfun$main$1.isThisGreenVegetable$1(option_over_n
                                                  //| ull.scala:20)
                                                  //| 	at option_over_null$$anonfun$main$1.apply$mcV$sp(option_over_null.scala:
                                                  //| 31)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at option_over_null$.main(option_over_null.scala:3)
                                                  //| 	at option_over_null.main(option_over_null.scala)


}