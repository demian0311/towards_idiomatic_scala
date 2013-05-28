object monads_motivation {
    case class User(id: Int, name: String)
    case class Account(id: Int)

    class UserManager {
        def findUserById(id: Int): Option[User] = {
            if (id == 1) Some(User(1, "Alice")) else None
        }
    }

    class AccountManager {
        def findAccountForUser(user: User): Option[Account] = {
            if (user.id == 1) Some(Account(10)) else None
        }
    }

    class ChannelManager {
        def findChannelsForAccount(account: Account): Option[List[String]] = {
            account match {
                case Account(10) => Some(List("AAA", "BBB", "CCC"))
                case _ => None
            }
        }
    }

    val userManager = new UserManager()           //> userManager  : monads_motivation.UserManager = monads_motivation$UserManager
                                                  //| @3452a22d
    val accountManager = new AccountManager()     //> accountManager  : monads_motivation.AccountManager = monads_motivation$Accou
                                                  //| ntManager@3e6ea3fe
    val channelManager = new ChannelManager()     //> channelManager  : monads_motivation.ChannelManager = monads_motivation$Chann
                                                  //| elManager@2bb5f635

    // the right way with for comprehensions
    def findChannelsForUser(id: Int): Option[List[String]] = {
        for {
            user <- userManager.findUserById(id)
            account <- accountManager.findAccountForUser(user)
            channels <- channelManager.findChannelsForAccount(account)
        } yield (channels)
    }                                             //> findChannelsForUser: (id: Int)Option[List[String]]

    findChannelsForUser(1)                        //> res0: Option[List[String]] = Some(List(AAA, BBB, CCC))

    def findChannelsForUser1(id: Int): Option[List[String]] = {
        userManager.findUserById(id) flatMap { user =>
            accountManager.findAccountForUser(user) flatMap { account =>
                channelManager.findChannelsForAccount(account)
            }
        }
    }                                             //> findChannelsForUser1: (id: Int)Option[List[String]]

    findChannelsForUser1(0)                       //> res1: Option[List[String]] = None

    def findChannelsForUser2(id: Int): Option[List[String]] = {
        userManager.findUserById(id) match {
            case Some(user) => {
                accountManager.findAccountForUser(user) match {
                    case Some(account) => {
                        channelManager.findChannelsForAccount(account)
                    }
                    case None => None
                }
            }
            case None => None
        }
    }                                             //> findChannelsForUser2: (id: Int)Option[List[String]]

    findChannelsForUser2(1)                       //> res2: Option[List[String]] = Some(List(AAA, BBB, CCC))

    def findChannelsForUser3(id: Int): Option[List[String]] = {
        val user = userManager.findUserById(id)
        if (user.isDefined) {
            val account = accountManager.findAccountForUser(user.get)
            if (account.isDefined) {
                channelManager.findChannelsForAccount(account.get)
            } else None
        } else None
    }                                             //> findChannelsForUser3: (id: Int)Option[List[String]]

    findChannelsForUser3(1)                       //> res3: Option[List[String]] = Some(List(AAA, BBB, CCC))

    def findChannelsForUser4(id: Int): Option[List[String]] = {
        try {
            channelManager.findChannelsForAccount(
                accountManager.findAccountForUser(
                    userManager.findUserById(id).get).get)
        } catch {
            case e: Throwable => None
        }
    }                                             //> findChannelsForUser4: (id: Int)Option[List[String]]

    findChannelsForUser4(1)                       //> res4: Option[List[String]] = Some(List(AAA, BBB, CCC))

    def findChannelsForUser5(id: Int): Option[List[String]] = {
        channelManager.findChannelsForAccount(
            accountManager.findAccountForUser(
                userManager.findUserById(id).get).get)
    }                                             //> findChannelsForUser5: (id: Int)Option[List[String]]

    findChannelsForUser5(10)                      //> java.util.NoSuchElementException: None.get
                                                  //| 	at scala.None$.get(Option.scala:274)
                                                  //| 	at scala.None$.get(Option.scala:272)
                                                  //| 	at monads_motivation$$anonfun$main$1.findChannelsForUser5$1(monads_motiv
                                                  //| ation.scala:94)
                                                  //| 	at monads_motivation$$anonfun$main$1.apply$mcV$sp(monads_motivation.scal
                                                  //| a:97)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at monads_motivation$.main(monads_motivation.scala:24)
                                                  //| 	at monads_motivation.main(monads_motivation.scala)

}