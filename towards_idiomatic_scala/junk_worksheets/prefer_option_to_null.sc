object prefer_option_to_null {

    case class User(id: Int, username: String)

    def findUser0(id: Int): User = {
        id match {
            case 1 => User(1, "foo")
            case 2 => User(2, "bar")
            case _ => null
        }
    }                                             //> findUser0: (id: Int)prefer_option_to_null.User

    val result0 = findUser0(3)                    //> result0  : prefer_option_to_null.User = null

    if (result0 != null) {
        println("hello: " + result0.username)
    } else {
        println("there was no user")
    }                                             //> there was no user

    ////////////

    def findUser1(id: Int): Option[User] = {
        id match {
            case 1 => Some(User(1, "foo"))
            case 2 => Some(User(2, "bar"))
            case _ => None
        }
    }                                             //> findUser1: (id: Int)Option[prefer_option_to_null.User]

    findUser1(3) match {
        case Some(user) => println("hello: " + user.username)
        case None       => println("there was no user")
    }                                             //> there was no user
    
    Option(23)                                    //> res0: Option[Int] = Some(23)
    Option(null)                                  //> res1: Option[Null] = None
    
    // cool option tricks
    Option("hello") match {
      case Some(theWord) => "the word is: " + theWord
      case None          => "we got a none"
    }                                             //> res2: java.lang.String = the word is: hello

    Option(null) match{
      case Some(theWord) => "the word is: " + theWord
      case None          => "we got a none"
    }                                             //> res3: java.lang.String = we got a none
}