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
  

  isThisGreenVegetable1(Vegetable("asparagus", None))
                                                  //> res0: Boolean = false


}