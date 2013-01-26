object either {
   case class User(
      id: Int,
      username: String,
      dateOfBirth: Option[java.util.Date] = None);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(159); 
      
   val a = User(1, "admin");System.out.println("""a  : either.User = """ + $show(a ));$skip(32); 
   val b = User(2, "foo", None);System.out.println("""b  : either.User = """ + $show(b ));$skip(52); 
   val c = User(3, "foo", Some(new java.util.Date));System.out.println("""c  : either.User = """ + $show(c ));$skip(174); 
  
   def findUserById(id: Int): Either[String, User] = {
      id match{
        case 1 => Right(User(1, "admin"))
        case _ => Left("couldn't find user")
      }
   };System.out.println("""findUserById: (id: Int)Either[String,either.User]""");$skip(23); val res$0 = 
   
   findUserById(1);System.out.println("""res0: Either[String,either.User] = """ + $show(res$0))}
   
   

}