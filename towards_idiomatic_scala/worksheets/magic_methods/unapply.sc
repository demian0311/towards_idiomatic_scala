object unapply {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	object Vegetable{
		def apply(name: String, color: String) = new Vegetable(name, color)
		def unapply(v: Vegetable) = {
			Some((v.name, v.color))
		}
		
		def unapply(s: String) = {
			val splitString = s.split('|')
			if(splitString.length != 2){
				None
			} else {
				Some((splitString(0), splitString(1)))
			}
		}
	}
	
	class Vegetable(val name: String, val color: String)
	
	val v = Vegetable("asparagus", "green")   //> v  : unapply.Vegetable = unapply$$anonfun$main$1$Vegetable$3@19e3118a
	
	Vegetable("corn", "yellow") match {
		case Vegetable(name, color) => "we got some " + color + " " + name
		case _ => "must not be a vegetable"
	}                                         //> res0: java.lang.String = we got some yellow corn

	"spinach|green" match {
		case Vegetable(name, color) => "we got some " + color + " " + name
		case _ => "don't know how to handle this"
	}                                         //> res1: java.lang.String = we got some green spinach
	
	
	
	
}