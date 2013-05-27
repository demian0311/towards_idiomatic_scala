object case_classes {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet")}
  
  abstract class Food
  case class Vegetable(name: String, color: String) extends Food
  
  
  
}