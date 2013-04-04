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
  case class CaseClass(name: String, color: String)
  
  ////////////////////////////////////////
  
  val a = new SimpleClass("a", "red")             //> a  : java_style_case_class.SimpleClass = java_style_case_class$SimpleClass@
                                                  //| 4b1f74aa
  val b = EquivalentClass("b", "green")           //> b  : java_style_case_class.EquivalentClass = EquivalentClass(b,green)
  
  val c = CaseClass("c", "blue")                  //> c  : java_style_case_class.CaseClass = CaseClass(c,blue)
  
  val a0 = new SimpleClass("a", "red")            //> a0  : java_style_case_class.SimpleClass = java_style_case_class$SimpleClass
                                                  //| @3e6ea3fe
  a == a0                                         //> res0: Boolean = false
  
  val b0 = EquivalentClass("b", "green")          //> b0  : java_style_case_class.EquivalentClass = EquivalentClass(b,green)
  b == b0                                         //> res1: Boolean = true

  val c0 = CaseClass("c", "blue")                 //> c0  : java_style_case_class.CaseClass = CaseClass(c,blue)
  c == c0                                         //> res2: Boolean = true
}