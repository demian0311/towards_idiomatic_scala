object noReturnStatements {

  object Person{
    def apply(firstName: String, lastName: String): Person = {
      new Person(firstName, lastName)
    }
  }

  class Person(firstName: String, lastName: String){
    def sayHello: String = {
      "Hello, my name is " + firstName
    }
  };import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(336); 
  
  val d = new Person("Demian", "Neidetcher");System.out.println("""d  : noReturnStatements.Person = """ + $show(d ));$skip(13); val res$0 = 
  d.sayHello;System.out.println("""res0: String = """ + $show(res$0));$skip(46); 
  
  val c = Person("Courtney", "Neidetcher");System.out.println("""c  : noReturnStatements.Person = """ + $show(c ));$skip(13); val res$1 = 
  c.sayHello;System.out.println("""res1: String = """ + $show(res$1))}

}