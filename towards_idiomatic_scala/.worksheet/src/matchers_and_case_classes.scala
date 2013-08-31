object matchers_and_case_classes {

	case class User(id: Int, name: String, favoriteChannel: Channel)
  case class Channel(id: Int, name: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(208); 

	// dealing with types
	val thing: Object = Channel(0, "AAA");System.out.println("""thing  : java.lang.Object = """ + $show(thing ));$skip(176); val res$0 = 

	if (thing.isInstanceOf[User]) {
		"can't handle User"
	} else if (thing.isInstanceOf[Channel]){
		"got channel: " + thing.asInstanceOf[Channel].name
	} else {
		"unknown"
	};System.out.println("""res0: java.lang.String = """ + $show(res$0));$skip(130); val res$1 = 
	
	thing match {
		case u: User => "can't handle User"
		case Channel(_, name) => "got channel: " + name
		case _ => "unknown"
	};System.out.println("""res1: java.lang.String = """ + $show(res$1));$skip(77); 
	
	
  // nested case classes
	val user = User(0, "Alice", Channel(0, "BBB"));System.out.println("""user  : matchers_and_case_classes.User = """ + $show(user ));$skip(121); val res$2 = 
	user match {
		case User(_, name, Channel(_, "BBB")) => name + " likes channel BBB"
		case _ => "didn't find anyone"
	}

	// sealed case classes
	sealed abstract class Device
	case class SetTopBox(name: String) extends Device
	case class SmartPhone(name: String) extends Device
	case class Computer(name: String) extends Device;System.out.println("""res2: java.lang.String = """ + $show(res$2));$skip(261); 

	val userDevice: Device = new SmartPhone("Android");System.out.println("""userDevice  : matchers_and_case_classes.Device = """ + $show(userDevice ));$skip(87); val res$3 = 
	userDevice match {
		case SetTopBox(name) => false
		case SmartPhone(name) => true
	};System.out.println("""res3: Boolean = """ + $show(res$3))}


}