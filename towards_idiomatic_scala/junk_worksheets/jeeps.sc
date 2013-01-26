object jeeps {
  object Car{
    def apply(make: String, model: String): Car = new Car(make, model)
  }
  
  class Car(make: String, model: String){
    var currentGear: Int = 0
    
    def apply(gearIn: Int): Unit = currentGear = gearIn
    
    def showStatus: String = {
      "I'm in the " + currentGear + " gear."
    }
  }
  
  // use apply on an object
  val j = Car("Jeep", "Wrangler")                 //> j  : jeeps.Car = jeeps$Car@485329c5
  j.showStatus                                    //> res0: String = I'm in the 0 gear.
  
  // use apply on a class
  j(3)
  j.showStatus                                    //> res1: String = I'm in the 3 gear.
}