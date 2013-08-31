object java_style_case_class {

  // A simple Scala class
  class SimpleClass(name: String, color: String)

  // Scala class with more features
  object EquivalentClass{
    def apply(name: String, color: String) = new EquivalentClass(name, color)
    def unapply(s: EquivalentClass) = Some((s.name, s.color))
  }
  
  // show how we'd use the un-apply extractor
  // and how they can be used in matchers
  // http://www.scala-lang.org/node/112
  
  class EquivalentClass(val name: String, val color: String){
    override def toString(): String = {
      "EquivalentClass(" + name + "," + color + ")"
    }
    
    override def equals(other: Any): Boolean = {
      other match {
        case sameType: EquivalentClass => {
          (name == sameType.name) && (color == sameType.color)
        }
        case _ => {
          false
        }
      }
    }
  }
  
  // Scala case class
  case class CaseClass(name: String, color: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1026); 
  
  ////////////////////////////////////////
  
  val a = new SimpleClass("a", "red");System.out.println("""a  : java_style_case_class.SimpleClass = """ + $show(a ));$skip(40); 
  val b = EquivalentClass("b", "green");System.out.println("""b  : java_style_case_class.EquivalentClass = """ + $show(b ));$skip(36); 
  
  val c = CaseClass("c", "blue");System.out.println("""c  : java_style_case_class.CaseClass = """ + $show(c ));$skip(42); 
  
  val a0 = new SimpleClass("a", "red");System.out.println("""a0  : java_style_case_class.SimpleClass = """ + $show(a0 ));$skip(10); val res$0 = 
  a == a0;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(44); 
  
  val b0 = EquivalentClass("b", "green");System.out.println("""b0  : java_style_case_class.EquivalentClass = """ + $show(b0 ));$skip(10); val res$1 = 
  b == b0;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(35); 

  val c0 = CaseClass("c", "blue");System.out.println("""c0  : java_style_case_class.CaseClass = """ + $show(c0 ));$skip(10); val res$2 = 
  c == c0;System.out.println("""res2: Boolean = """ + $show(res$2))}
}