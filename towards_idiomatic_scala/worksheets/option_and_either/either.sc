package foo

object either {
    case class User(
        id: Int,
        username: String,
        dateOfBirth: Option[java.util.Date] = None)

    val a = User(1, "admin")                      //> a  : foo.either.User = User(1,admin,None)
    val b = User(2, "foo", None)                  //> b  : foo.either.User = User(2,foo,None)
    val c = User(3, "foo", Some(new java.util.Date))
                                                  //> c  : foo.either.User = User(3,foo,Some(Sun Jan 27 13:33:18 CST 2013))

    def findUserById(id: Int): Either[String, User] = {
        id match {
            case 1 => Right(User(1, "admin"))
            case _ => Left("couldn't find user")
        }
    }                                             //> findUserById: (id: Int)Either[String,foo.either.User]

    findUserById(1)                               //> res0: Either[String,foo.either.User] = Right(User(1,admin,None))
    findUserById(3)                               //> res1: Either[String,foo.either.User] = Left(couldn't find user)


    val result = findUserById(1)                  //> result  : Either[String,foo.either.User] = Right(User(1,admin,None))
    
    if(result.isRight){
      println("found a user: " + result.right.get.username)
    }
    else if(result.isLeft){
      println("error: " + result.left)
    }                                             //> found a user: admin

    findUserById(1) match {
        case Right(u) => println("found a user: " + u.username)
        case Left(m) => println("error: " + m)
    }                                             //> found a user: admin

}