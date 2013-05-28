object classes {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  case class Fruit(name: String, var color: String)
  
  val f = new Fruit("foo", "bar")                 //> f  : classes.Fruit = Fruit(foo,bar)
  val b = f.copy(color="red")                     //> b  : classes.Fruit = Fruit(foo,red)
  
  "one" match {
  		case "zero" => Some(0)
  		case "one" => Some(1)
  		case _ => None
  }                                               //> res0: Option[Int] = Some(1)
  


	def fizzBuzz(n: Int) = n + ":" + (if(n % 3 == 0) "fizz" else "") + (if(n % 5 == 0) "buzz" else "")
                                                  //> fizzBuzz: (n: Int)java.lang.String

	(1 to 20) map {fizzBuzz(_)} mkString "\n" //> res1: String = 1:
                                                  //| 2:
                                                  //| 3:fizz
                                                  //| 4:
                                                  //| 5:buzz
                                                  //| 6:fizz
                                                  //| 7:
                                                  //| 8:
                                                  //| 9:fizz
                                                  //| 10:buzz
                                                  //| 11:
                                                  //| 12:fizz
                                                  //| 13:
                                                  //| 14:
                                                  //| 15:fizzbuzz
                                                  //| 16:
                                                  //| 17:
                                                  //| 18:fizz
                                                  //| 19:
                                                  //| 20:buzz
  
  
  def defineNumber(num: Int): String = {
  		num match {
  			case x if x % 2 == 0 => "even"
  			case _ => "odd"
  		}
  }                                               //> defineNumber: (num: Int)String
  
  defineNumber(5)                                 //> res2: String = odd
  
}