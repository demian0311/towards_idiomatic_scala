object case_classes {
 
 class Vegetable0(){
    var thisName: String = null
    var thisColor: String = null
  
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
    
    def setColor(colorIn: String) = {
      thisColor = colorIn
    }
    
    def color: String = {
      this.color
    }
    
    override def toString(): String = {
      "Vegetable(" + thisName + ")"
    }
    
    // TODO: hashCode and equals
  }
    
    val va0 = new Vegetable0("asparagus")         //> va0  : case_classes.Vegetable0 = Vegetable(asparagus)
    va0.name                                      //> res0: String = asparagus
    va0.color                                     //> java.lang.StackOverflowError
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.scala:25)
                                                  //| 	at case_classes$Vegetable0.color(case_classes.s
                                                  //| Output exceeds cutoff limit.
    //va0.setColor("yellow")
    va0.color
  
  class Vegetable(thisName: String, var color: String = "green"){
    def name: String = {
      thisName
    }
    
    override def toString(): String = {
      "Vegetable(" + thisName + ")"
    }
    
    // TODO: hashCode and equals
  }
  val va = new Vegetable("asparagus")
  va.name
  va.color
  va.color="yellow"
  va.color
  
  val vb = new Vegetable("brussels sprout")
  val va2 = new Vegetable("asparagus")

  //assert("Vegetable(asparagus)" ==
  va.toString
  va == va2

  case class Fruit(name: String, var color: String)

  val fa = Fruit("apple", "red")
  fa.color = "green"
  val fb = Fruit("banana", "yellow")
  val fa2 = fa.copy(color="green")
  
  
  fa == fa2

}