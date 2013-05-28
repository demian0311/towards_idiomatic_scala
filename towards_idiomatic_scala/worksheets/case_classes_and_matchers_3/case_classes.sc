
object case_classes {
  class User(val id: Int, val name: String)
  case class Channel(id: Int, name: String)
  
  // free object apply
  val user = new User(0, "Alice")                 //> user  : case_classes.User = case_classes$User@1f68406c
  val channel = Channel(0, "AAA")                 //> channel  : case_classes.Channel = Channel(0,AAA)
  
  // free sensible toString
  user.toString                                   //> res0: java.lang.String = case_classes$User@1f68406c
  channel.toString                                //> res1: String = Channel(0,AAA)
  
  val userAlice = new User(0, "Alice")            //> userAlice  : case_classes.User = case_classes$User@1d927624
  val channelAaa = new Channel(0, "AAA")          //> channelAaa  : case_classes.Channel = Channel(0,AAA)
  
  // free quals
  user == userAlice                               //> res2: Boolean = false
  channel == channelAaa                           //> res3: Boolean = true
  
  // free hashCode
  user.hashCode                                   //> res4: Int = 526925932
  userAlice.hashCode                              //> res5: Int = 496137764
  channel.hashCode                                //> res6: Int = -1722956194
  channelAaa.hashCode                             //> res7: Int = -1722956194
  
  // copy
  val differentAlice = new User(id=1, name=userAlice.name)
                                                  //> differentAlice  : case_classes.User = case_classes$User@63a7a517
  val differentAaa = channelAaa.copy(id=1)        //> differentAaa  : case_classes.Channel = Channel(1,AAA)
  
  //////////////// now use matchers with case classes
  
  // We would need to create an unapply
  //user match {
  	//	case User(id, "Alice") => "Alice has ID of " + id
  	//	case _ => "couldn't find Alice"
  //}
  
  channel match {
  		case Channel(id, "AAA") => "AAA has ID of " + id
  		case _ => "couldn't find AAA"
  }                                               //> res8: java.lang.String = AAA has ID of 0
  
  
  
}