object prefer_option_to_null {

    case class User(id: Int, username: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(252); 

    def findUser0(id: Int): User = {
        id match {
            case 1 => User(1, "foo")
            case 2 => User(2, "bar")
            case _ => null
        }
    };System.out.println("""findUser0: (id: Int)prefer_option_to_null.User""");$skip(32); 

    val result0 = findUser0(3);System.out.println("""result0  : prefer_option_to_null.User = """ + $show(result0 ));$skip(130); 

    if (result0 != null) {
        println("hello: " + result0.username)
    } else {
        println("there was no user")
    };$skip(212); 

    ////////////

    def findUser1(id: Int): Option[User] = {
        id match {
            case 1 => Some(User(1, "foo"))
            case 2 => Some(User(2, "bar"))
            case _ => None
        }
    };System.out.println("""findUser1: (id: Int)Option[prefer_option_to_null.User]""");$skip(150); 

    findUser1(3) match {
        case Some(user) => println("hello: " + user.username)
        case None       => println("there was no user")
    };$skip(20); val res$0 = 
    
    Option(23);System.out.println("""res0: Option[Int] = """ + $show(res$0));$skip(17); val res$1 = 
    Option(null);System.out.println("""res1: Option[Null] = """ + $show(res$1));$skip(163); val res$2 = 
    
    // cool option tricks
    Option("hello") match {
      case Some(theWord) => "the word is: " + theWord
      case None          => "we got a none"
    };System.out.println("""res2: java.lang.String = """ + $show(res$2));$skip(129); val res$3 = 

    Option(null) match{
      case Some(theWord) => "the word is: " + theWord
      case None          => "we got a none"
    };System.out.println("""res3: java.lang.String = """ + $show(res$3))}
}