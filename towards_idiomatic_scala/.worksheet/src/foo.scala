object foo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(36); 
  val s = "hello world";System.out.println("""s  : java.lang.String = """ + $show(s ));$skip(25); 
  val arr = s.split(' ');System.out.println("""arr  : Array[String] = """ + $show(arr ));$skip(20); val res$0 = 
  arr.mkString("_");System.out.println("""res0: String = """ + $show(res$0));$skip(21); 
  
  val foo = "bar"
  
  
  case class User(id: Int, name: String, favoriteChannel: Channel)
  case class Channel(id: Int, name: String);System.out.println("""foo  : java.lang.String = """ + $show(foo ));$skip(169); 
  
  val user = User(0, "Alice", Channel(0, "BBB"));System.out.println("""user  : foo.User = """ + $show(user ));$skip(130); val res$1 = 

	user match {
		case User(_, name, Channel(_, "BBB")) =>
        name + " likes channel BBB"
		case _ => "didn't find anyone"
	};System.out.println("""res1: java.lang.String = """ + $show(res$1))}
}