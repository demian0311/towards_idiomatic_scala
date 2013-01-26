object for_loop {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  println("Welcome to the Scala worksheet");$skip(189); 
  
  // this is not good
  def sum(vectorIn: Vector[Int]): Int = {
    var currSum = 0
    for(currInt <- 0 until vectorIn.length){
      currSum += vectorIn(currInt)
    }
    currSum
  };System.out.println("""sum: (vectorIn: Vector[Int])Int""");$skip(26); val res$0 = 
  
  sum(Vector(1, 2, 3));System.out.println("""res0: Int = """ + $show(res$0));$skip(85); 
  
  
  def sum2(vectorIn: Vector[Int]): Int = {
    vectorIn.foldLeft(0)(_ + _)
  };System.out.println("""sum2: (vectorIn: Vector[Int])Int""");$skip(33); val res$1 = 
  
  
  
  sum2(Vector(1, 2, 3));System.out.println("""res1: Int = """ + $show(res$1));$skip(70); 
  
  
  def sum3(vectorIn: Vector[Int]): Int = {
    vectorIn.sum
  };System.out.println("""sum3: (vectorIn: Vector[Int])Int""");$skip(27); val res$2 = 
  
  sum3(Vector(1, 2, 3));System.out.println("""res2: Int = """ + $show(res$2));$skip(38); val res$3 = 

  Vector(1, 2, 3).foldLeft(0)(_ + _);System.out.println("""res3: Int = """ + $show(res$3));$skip(22); val res$4 = 
  Vector(1, 2, 3).sum;System.out.println("""res4: Int = """ + $show(res$4))}
  
  
}