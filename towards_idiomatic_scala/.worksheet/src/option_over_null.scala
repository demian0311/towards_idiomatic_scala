object option_over_null {

  case class Fruit(name: String, color: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  
  val a = Fruit("apple", null);System.out.println("""a  : option_over_null.Fruit = """ + $show(a ));$skip(81); 
  
  def isThisGreenFruit(f: Fruit): Boolean = {
    f.color.equals("green")
  }
  
  //isThisGreenFruit(null)
  //isThisGreenFruit(Fruit("", null))

  //
  
  case class Vegetable(name: String, color: Option[String]);System.out.println("""isThisGreenFruit: (f: option_over_null.Fruit)Boolean""");$skip(228); 
  
  
  def isThisGreenVegetable(v: Vegetable): Boolean = {
    v.color.get == "green"
  };System.out.println("""isThisGreenVegetable: (v: option_over_null.Vegetable)Boolean""");$skip(159); 
  
  
  def isThisGreenVegetable1(v: Vegetable): Boolean = {
    v.color match {
      case Some(value) => value == "green"
      case None => false
    }
  };System.out.println("""isThisGreenVegetable1: (v: option_over_null.Vegetable)Boolean""");$skip(54); val res$0 = 

  isThisGreenVegetable(Vegetable("asparagus", None));System.out.println("""res0: Boolean = """ + $show(res$0))}


}