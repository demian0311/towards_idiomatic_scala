object monads_motivation {
  println("Welcome to the Scala worksheet")
  
  // this is lifted highly from Dan Rosen's
  // video http://marakana.com/s/post/1034/scala_monads_declutter_your_code_with_monadic_design
  
  case class User(id: Int, username: String)
  
  val users = List(User(0, "Alice"), (1, "Bob"), (2, "Charlie"))
  
  
  class UserDao{
  		def findUser(id: Int): Option[User] = {
  			users.f
  		}
  }
  
  
}