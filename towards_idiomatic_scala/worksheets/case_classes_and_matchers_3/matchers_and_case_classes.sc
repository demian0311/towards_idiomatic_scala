object matchers_and_case_classes {

	case class User(id: Int, name: String, favoriteChannel: Channel)
  case class Channel(id: Int, name: String)

	// dealing with types
	val thing: Object = Channel(0, "AAA")     //> thing  : java.lang.Object = Channel(0,AAA)

	if (thing.isInstanceOf[User]) {
		"can't handle User"
	} else if (thing.isInstanceOf[Channel]){
		"got channel: " + thing.asInstanceOf[Channel].name
	} else {
		"unknown"
	}                                         //> res0: java.lang.String = got channel: AAA
	
	thing match {
		case u: User => "can't handle User"
		case Channel(_, name) => "got channel: " + name
		case _ => "unknown"
	}                                         //> res1: java.lang.String = got channel: AAA
	
	
  // nested case classes
	val user = User(0, "Alice", Channel(0, "BBB"))
                                                  //> user  : matchers_and_case_classes.User = User(0,Alice,Channel(0,BBB))
	user match {
		case User(_, name, Channel(_, "BBB")) => name + " likes channel BBB"
		case _ => "didn't find anyone"
	}                                         //> res2: java.lang.String = Alice likes channel BBB

	// sealed case classes
	sealed abstract class Device
	case class SetTopBox(name: String) extends Device
	case class SmartPhone(name: String) extends Device
	case class Computer(name: String) extends Device

	val userDevice: Device = new SmartPhone("Android")
                                                  //> userDevice  : matchers_and_case_classes.Device = SmartPhone(Android)
	userDevice match {
		case SetTopBox(name) => false
		case SmartPhone(name) => true
	}                                         //> res3: Boolean = true


}