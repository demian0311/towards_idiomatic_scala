
object case_classes {
  class User(val id: Int, val name: String)
  case class Channel(id: Int, name: String)
  
  // free object apply
  val user = new User(0, "Alice")                 //> user  : case_classes.User = case_classes$User@1ce34b50
  val channel = Channel(0, "AAA")                 //> channel  : case_classes.Channel = Channel(0,AAA)
  
  // free sensible toString
  user.toString                                   //> res0: java.lang.String = case_classes$User@1ce34b50
  channel.toString                                //> res1: String = Channel(0,AAA)
  
  // free copy
  val sameUser = new User(0, user.name)           //> sameUser  : case_classes.User = case_classes$User@29a9c73
  val sameChannel = channel.copy(id=0)            //> sameChannel  : case_classes.Channel = Channel(0,AAA)
  
  // free quals
  user == sameUser                                //> res2: Boolean = false
  channel == sameChannel                          //> res3: Boolean = true
  
  // free hashCode
  user.hashCode                                   //> res4: Int = 484658000
  sameUser.hashCode                               //> res5: Int = 43687027
  channel.hashCode                                //> res6: Int = -1722956194
  sameChannel.hashCode                            //> res7: Int = -1722956194
  
  // binding vals from an instance
  val Channel(id, _) = channel                    //> id  : Int = 0
  "id is " + id                                   //> res8: java.lang.String = id is 0
  
  //////////////// now use matchers with case classes
  
  // We would need to create an unapply
  /*user match {
  		case User(id, "Alice") => "Alice has ID of " + id
  		case _ => "couldn't find Alice"
  }*/
  
  channel match {
  		case Channel(id, "AAA") => "AAA has ID of " + id
  		case _ => "couldn't find AAA"
  }                                               //> res9: java.lang.String = AAA has ID of 0
  
  
  
}