package foo

object either {
    case class User(
        id: Int,
        username: String,
        dateOfBirth: Option[java.util.Date] = None);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(174); 

    val a = User(1, "admin");System.out.println("""a  : foo.either.User = """ + $show(a ));$skip(33); 
    val b = User(2, "foo", None);System.out.println("""b  : foo.either.User = """ + $show(b ));$skip(53); 
    val c = User(3, "foo", Some(new java.util.Date));System.out.println("""c  : foo.either.User = """ + $show(c ));$skip(187); 

    def findUserById(id: Int): Either[String, User] = {
        id match {
            case 1 => Right(User(1, "admin"))
            case _ => Left("couldn't find user")
        }
    };System.out.println("""findUserById: (id: Int)Either[String,foo.either.User]""");$skip(21); val res$0 = 

    findUserById(1);System.out.println("""res0: Either[String,foo.either.User] = """ + $show(res$0));$skip(20); val res$1 = 
    findUserById(3);System.out.println("""res1: Either[String,foo.either.User] = """ + $show(res$1));$skip(134); 

    findUserById(1) match {
        case Right(u) => println("found a user: " + u.username)
        case Left(m) => println(m)
    }}

}