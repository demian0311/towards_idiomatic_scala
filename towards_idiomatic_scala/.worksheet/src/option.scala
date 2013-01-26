object option {


   case class User(
      id: Int,
      username: String,
      dateOfBirth: Option[java.util.Date] = None);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 
      
   val a = User(1, "admin");System.out.println("""a  : option.User = """ + $show(a ));$skip(32); 
   val b = User(2, "foo", None);System.out.println("""b  : option.User = """ + $show(b ));$skip(52); 
   val c = User(3, "foo", Some(new java.util.Date));System.out.println("""c  : option.User = """ + $show(c ));$skip(148); 
      

   def findUserById(id: Int): Option[User] = {
      id match{
        case 1 => Some(User(1, "admin"))
        case _ => None
      }
   };System.out.println("""findUserById: (id: Int)Option[option.User]""");$skip(23); val res$0 = 
   
   findUserById(1);System.out.println("""res0: Option[option.User] = """ + $show(res$0));$skip(19); val res$1 = 
   findUserById(3);System.out.println("""res1: Option[option.User] = """ + $show(res$1));$skip(142); 
   
   findUserById(1) match {
    case Some(u) => println("found a user: " + u.username)
    case None => println("couldn't find user")
   }
   
   

   case class Fruit(name: String, color: String, quantity: Option[Int] = None);$skip(138); 
   
   val p = Fruit("pineapple", "yellow", None);System.out.println("""p  : option.Fruit = """ + $show(p ))}
//   val a = Fruit("apple", "red")
  
  
}