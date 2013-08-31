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
    };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(723); 

    val userManager = new UserManager();System.out.println("""userManager  : monads_motivation.UserManager = """ + $show(userManager ));$skip(46); 
    val accountManager = new AccountManager();System.out.println("""accountManager  : monads_motivation.AccountManager = """ + $show(accountManager ));$skip(46); 
    val channelManager = new ChannelManager();System.out.println("""channelManager  : monads_motivation.ChannelManager = """ + $show(channelManager ));$skip(339); 

    // the right way with for comprehensions
    def findChannelsForUser(id: Int): Option[List[String]] = {
        for {
            user <- userManager.findUserById(id)
            account <- accountManager.findAccountForUser(user)
            channels <- channelManager.findChannelsForAccount(account)
        } yield (channels)
    };System.out.println("""findChannelsForUser: (id: Int)Option[List[String]]""");$skip(28); val res$0 = 

    findChannelsForUser(1);System.out.println("""res0: Option[List[String]] = """ + $show(res$0));$skip(286); 

    def findChannelsForUser1(id: Int): Option[List[String]] = {
        userManager.findUserById(id) flatMap { user =>
            accountManager.findAccountForUser(user) flatMap { account =>
                channelManager.findChannelsForAccount(account)
            }
        }
    };System.out.println("""findChannelsForUser1: (id: Int)Option[List[String]]""");$skip(29); val res$1 = 

    findChannelsForUser1(0);System.out.println("""res1: Option[List[String]] = """ + $show(res$1));$skip(460); 

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
    };System.out.println("""findChannelsForUser2: (id: Int)Option[List[String]]""");$skip(29); val res$2 = 

    findChannelsForUser2(1);System.out.println("""res2: Option[List[String]] = """ + $show(res$2));$skip(367); 

    def findChannelsForUser3(id: Int): Option[List[String]] = {
        val user = userManager.findUserById(id)
        if (user.isDefined) {
            val account = accountManager.findAccountForUser(user.get)
            if (account.isDefined) {
                channelManager.findChannelsForAccount(account.get)
            } else None
        } else None
    };System.out.println("""findChannelsForUser3: (id: Int)Option[List[String]]""");$skip(29); val res$3 = 

    findChannelsForUser3(1);System.out.println("""res3: Option[List[String]] = """ + $show(res$3));$skip(312); 

    def findChannelsForUser4(id: Int): Option[List[String]] = {
        try {
            channelManager.findChannelsForAccount(
                accountManager.findAccountForUser(
                    userManager.findUserById(id).get).get)
        } catch {
            case e: Throwable => None
        }
    };System.out.println("""findChannelsForUser4: (id: Int)Option[List[String]]""");$skip(29); val res$4 = 

    findChannelsForUser4(1);System.out.println("""res4: Option[List[String]] = """ + $show(res$4));$skip(220); 

    def findChannelsForUser5(id: Int): Option[List[String]] = {
        channelManager.findChannelsForAccount(
            accountManager.findAccountForUser(
                userManager.findUserById(id).get).get)
    };System.out.println("""findChannelsForUser5: (id: Int)Option[List[String]]""");$skip(30); val res$5 = 

    findChannelsForUser5(10);System.out.println("""res5: Option[List[String]] = """ + $show(res$5))}

}