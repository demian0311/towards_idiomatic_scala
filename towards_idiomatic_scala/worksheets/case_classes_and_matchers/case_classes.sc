object case_classes {
 
  
  class Vegetable(){
    var thisName: String = null
  
    def this(nameIn: String) = {
      this()
      this.setName(nameIn)
    }
    
    def setName(nameIn: String) = {
      thisName = nameIn
    }
    
    def name: String = {
      thisName
    }
    
    override def toString(): String = {
      "Vegetable(" + thisName + ")"
    }
    
    // TODO: hashCode and equals
  }
  val va = new Vegetable("asparagus")             //> va  : case_classes.Vegetable = Vegetable(asparagus)
  val vb = new Vegetable("brussels sprout")       //> vb  : case_classes.Vegetable = Vegetable(brussels sprout)
  val va2 = new Vegetable("asparagus")            //> va2  : case_classes.Vegetable = Vegetable(asparagus)

  //assert("Vegetable(asparagus)" ==
  va.toString                                     //> res0: String = Vegetable(asparagus)
  va == va2                                       //> res1: Boolean = false

  case class Fruit(name: String, color: String)

  val fa = Fruit("apple", "red")                  //> fa  : case_classes.Fruit = Fruit(apple,red)
  val fb = Fruit("banana", "yellow")              //> fb  : case_classes.Fruit = Fruit(banana,yellow)
  val fa2 = fa.copy(color="green")                //> fa2  : case_classes.Fruit = Fruit(apple,green)
  
  
  fa == fa2                                       //> res2: Boolean = false

}