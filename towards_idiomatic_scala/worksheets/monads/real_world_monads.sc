object real_world_monads {
    case class User(id: Integer, username: String)
    case class Book(
    		title: String,
    		checkedOutByUser: String,
    		isOverdue: Boolean)

		// List is a Monad
    val books = List(
        Book("Programming in Scala", "Alice", false),
        Book("Release It!", "Alice", true),
        Book("Starting Strength", "Bob", true),
        Book("Getting Things Done", "Alice", true))

		// Option is a monad
    def findUserById(id: Integer): Option[User] = {
        if (id == 0) Some(User(0, "Alice")) else None
    }

    def findOverdueBookTitlesForUserId(id: Integer): List[String] = {
        for {
            book <- books
            user <- findUserById(id)
            if (book.checkedOutByUser == user.username)
            if (book.isOverdue)
        } yield (book.title)
    }

    findOverdueBookTitlesForUserId(0)
		findOverdueBookTitlesForUserId(1)
		
		/*
		books.filter{_.checkedOutByUser == "Alice"}
       
    def findOverdueBookTitlesForUserId2(id: Integer): List[String] = {
			val foo = for{
				user <- findUserById(id)
				_ <- Some(println("user: " + user))
				book <- books.filter{_.checkedOutByUser == "Alice"}
			} yield (book)

			println("foo: " + foo)

			List()
    }

		findOverdueBookTitlesForUserId2(0)
		*/
		
            
}