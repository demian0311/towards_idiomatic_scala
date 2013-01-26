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
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(450); 
  val va = new Vegetable("asparagus");System.out.println("""va  : case_classes.Vegetable = """ + $show(va ));$skip(44); 
  val vb = new Vegetable("brussels sprout");System.out.println("""vb  : case_classes.Vegetable = """ + $show(vb ));$skip(39); 
  val va2 = new Vegetable("asparagus");System.out.println("""va2  : case_classes.Vegetable = """ + $show(va2 ));$skip(52); val res$0 = 

  //assert("Vegetable(asparagus)" ==
  va.toString;System.out.println("""res0: String = """ + $show(res$0));$skip(12); val res$1 = 
  va == va2

  case class Fruit(name: String, color: String);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(83); 

  val fa = Fruit("apple", "red");System.out.println("""fa  : case_classes.Fruit = """ + $show(fa ));$skip(37); 
  val fb = Fruit("banana", "yellow");System.out.println("""fb  : case_classes.Fruit = """ + $show(fb ));$skip(35); 
  val fa2 = fa.copy(color="green");System.out.println("""fa2  : case_classes.Fruit = """ + $show(fa2 ));$skip(18); val res$2 = 
  
  
  fa == fa2;System.out.println("""res2: Boolean = """ + $show(res$2))}

}