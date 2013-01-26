object if_statement {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(261); 
  
  
  def status(age: Int): String = {
    var disposition = "INVALID"
    
    if(age <= 18){
      disposition = "MINOR"
    } else if (age >= 65){
      disposition = "RETIREE"
    } else {
      disposition = "ADULT"
    }
    
    return disposition
  };System.out.println("""status: (age: Int)String""");$skip(16); val res$0 = 
  
  status(19);System.out.println("""res0: String = """ + $show(res$0));$skip(12); val res$1 = 
  status(1);System.out.println("""res1: String = """ + $show(res$1));$skip(13); val res$2 = 
  status(65);System.out.println("""res2: String = """ + $show(res$2));$skip(157); 
    
  
  def status2(age: Int): String = {
    if(age <= 18){
      "MINOR"
    } else if (age >= 65){
      "RETIREE"
    } else {
      "ADULT"
    }
  };System.out.println("""status2: (age: Int)String""");$skip(17); val res$3 = 
  
  status2(19);System.out.println("""res3: String = """ + $show(res$3));$skip(13); val res$4 = 
  status2(1);System.out.println("""res4: String = """ + $show(res$4));$skip(14); val res$5 = 
  status2(65);System.out.println("""res5: String = """ + $show(res$5))}
  
}