object foo {
  val s = "hello world"                           //> s  : java.lang.String = hello world
  val arr = s.split(' ')                          //> arr  : Array[String] = Array(hello, world)
  arr.mkString("_")                               //> res0: String = hello_world
  
  val foo = "bar"                                 //> foo  : java.lang.String = bar
  
  
  case class User(id: Int, name: String, favoriteChannel: Channel)
  case class Channel(id: Int, name: String)
  
  val user = User(0, "Alice", Channel(0, "BBB"))  //> user  : foo.User = User(0,Alice,Channel(0,BBB))

	user match {
		case User(_, name, Channel(_, "BBB")) =>
        name + " likes channel BBB"
		case _ => "didn't find anyone"
	}                                         //> res1: java.lang.String = Alice likes channel BBB
}