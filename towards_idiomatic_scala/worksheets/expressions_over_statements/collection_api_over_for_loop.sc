object for_loop {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // this is not good
  def sum(vectorIn: Vector[Int]): Int = {
    var currSum = 0
    for(currInt <- 0 until vectorIn.length){
      currSum += vectorIn(currInt)
    }
    currSum
  }                                               //> sum: (vectorIn: Vector[Int])Int
  
  sum(Vector(1, 2, 3))                            //> res0: Int = 6
  
  
  def sum2(vectorIn: Vector[Int]): Int = {
    vectorIn.foldLeft(0)(_ + _)
  }                                               //> sum2: (vectorIn: Vector[Int])Int
  
  
  
  sum2(Vector(1, 2, 3))                           //> res1: Int = 6
  
  
  def sum3(vectorIn: Vector[Int]): Int = {
    vectorIn.sum
  }                                               //> sum3: (vectorIn: Vector[Int])Int
  
  sum3(Vector(1, 2, 3))                           //> res2: Int = 6

  Vector(1, 2, 3).foldLeft(0)(_ + _)              //> res3: Int = 6
  Vector(1, 2, 3).sum                             //> res4: Int = 6
  
  
}