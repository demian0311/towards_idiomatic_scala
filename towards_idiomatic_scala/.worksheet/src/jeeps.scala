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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(394); 
  
  // use apply on an object
  val j = Car("Jeep", "Wrangler");System.out.println("""j  : jeeps.Car = """ + $show(j ));$skip(15); val res$0 = 
  j.showStatus;System.out.println("""res0: String = """ + $show(res$0));$skip(36); 
  
  // use apply on a class
  j(3);$skip(15); val res$1 = 
  j.showStatus;System.out.println("""res1: String = """ + $show(res$1))}
}