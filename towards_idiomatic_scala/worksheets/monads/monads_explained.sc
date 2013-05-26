object monads_explained {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // monads are container types
  // Option, List
	// monads have higher order functions
	
	val ns = List(1, 2)                       //> ns  : List[Int] = List(1, 2)
	val qs = for (n <- ns) yield n * 2        //> qs  : List[Int] = List(2, 4)
	assert(qs == List(2, 4))
	
	ns map {n => n * 2}                       //> res0: List[Int] = List(2, 4)
  // expr flatMap {x => unit(resultExpr)}
  
  ns flatMap { x => List(x * 2)}                  //> res1: List[Int] = List(2, 4)
  
  
  // some cool funcitons that could be chainable
  // do fizzbuzz with monads
  
  // create a monad that has map and flatMap
  val foo: Option[String] = Some("foo")           //> foo  : Option[String] = Some(foo)
  
  
  // understanding yield
  val result = for (i <- 1 to 5) yield i          //> result  : scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5)
                                                  //| 
  
  
}