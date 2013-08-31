
object case_classes {
  class User(val id: Int, val name: String)
  case class Channel(id: Int, name: String);import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(170); 
  
  // free object apply
  val user = new User(0, "Alice");System.out.println("""user  : case_classes.User = """ + $show(user ));$skip(34); 
  val channel = Channel(0, "AAA");System.out.println("""channel  : case_classes.Channel = """ + $show(channel ));$skip(47); val res$0 = 
  
  // free sensible toString
  user.toString;System.out.println("""res0: java.lang.String = """ + $show(res$0));$skip(19); val res$1 = 
  channel.toString;System.out.println("""res1: String = """ + $show(res$1));$skip(58); 
  
  // free copy
  val sameUser = new User(0, user.name);System.out.println("""sameUser  : case_classes.User = """ + $show(sameUser ));$skip(39); 
  val sameChannel = channel.copy(id=0);System.out.println("""sameChannel  : case_classes.Channel = """ + $show(sameChannel ));$skip(38); val res$2 = 
  
  // free quals
  user == sameUser;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(25); val res$3 = 
  channel == sameChannel;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(38); val res$4 = 
  
  // free hashCode
  user.hashCode;System.out.println("""res4: Int = """ + $show(res$4));$skip(20); val res$5 = 
  sameUser.hashCode;System.out.println("""res5: Int = """ + $show(res$5));$skip(19); val res$6 = 
  channel.hashCode;System.out.println("""res6: Int = """ + $show(res$6));$skip(23); val res$7 = 
  sameChannel.hashCode;System.out.println("""res7: Int = """ + $show(res$7));$skip(69); 
  
  // binding vals from an instance
  val Channel(id, _) = channel;System.out.println("""id  : Int = """ + $show(id ));$skip(16); val res$8 = 
  "id is " + id;System.out.println("""res8: java.lang.String = """ + $show(res$8));$skip(325); val res$9 = 
  
  //////////////// now use matchers with case classes
  
  // We would need to create an unapply
  /*user match {
  		case User(id, "Alice") => "Alice has ID of " + id
  		case _ => "couldn't find Alice"
  }*/
  
  channel match {
  		case Channel(id, "AAA") => "AAA has ID of " + id
  		case _ => "couldn't find AAA"
  };System.out.println("""res9: java.lang.String = """ + $show(res$9))}
  
  
  
}