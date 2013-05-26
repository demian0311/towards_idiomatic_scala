object real_world_monads {
    case class User(id: Integer, username: String)
    case class Book(title: String, checkedOutByUser: String, isOverdue: Boolean)

    val books = List(
        Book("Programming in Scala", "foo", false),
        Book("Programming Perl", "bar", true),
        Book("Getting Things Done", "foo", true)) //> books  : List[real_world_monads.Book] = List(Book(Programming in Scala,foo,f
                                                  //| alse), Book(Programming Perl,bar,true), Book(Getting Things Done,foo,true))

    def findUserById(id: Integer): Option[User] = {
    			println("findUserById(" + id + ")")
        if (id == 0) Some(User(0, "foo")) else None
    }                                             //> findUserById: (id: Integer)Option[real_world_monads.User]

    def findOverdueBookTitlesForUserId(id: Integer): List[String] = {
        for {
            book <- books
            user <- findUserById(id)
            if (book.checkedOutByUser == user.username)
            if (book.isOverdue)
        } yield (book.title)
    }                                             //> findOverdueBookTitlesForUserId: (id: Integer)List[String]

    findOverdueBookTitlesForUserId(0)             //> findUserById(0)
                                                  //| findUserById(0)
                                                  //| findUserById(0)
                                                  //| res0: List[String] = List(Getting Things Done)
		findOverdueBookTitlesForUserId(1) //> findUserById(1)
                                                  //| findUserById(1)
                                                  //| findUserById(1)
                                                  //| res1: List[String] = List()
}