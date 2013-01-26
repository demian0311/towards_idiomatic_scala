object option {


   case class User(
      id: Int,
      username: String,
      dateOfBirth: Option[java.util.Date] = None)
      
   val a = User(1, "admin")                       //> a  : option.User = User(1,admin,None)
   val b = User(2, "foo", None)                   //> b  : option.User = User(2,foo,None)
   val c = User(3, "foo", Some(new java.util.Date))
                                                  //> c  : option.User = User(3,foo,Some(Sat Dec 01 19:00:15 CST 2012))
      

   def findUserById(id: Int): Option[User] = {
      id match{
        case 1 => Some(User(1, "admin"))
        case _ => None
      }
   }                                              //> findUserById: (id: Int)Option[option.User]
   
   findUserById(1)                                //> res0: Option[option.User] = Some(User(1,admin,None))
   findUserById(3)                                //> res1: Option[option.User] = None
   
   findUserById(1) match {
    case Some(u) => println("found a user: " + u.username)
    case None => println("couldn't find user")
   }                                              //> found a user: admin
   
   

   case class Fruit(name: String, color: String, quantity: Option[Int] = None)
   
   val p = Fruit("pineapple", "yellow", None)     //> p  : option.Fruit = Fruit(pineapple,yellow,None)
//   val a = Fruit("apple", "red")
  
  
}