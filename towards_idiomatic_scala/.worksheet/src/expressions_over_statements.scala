object expressions_over_statements {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(49); 

  val x = 2;System.out.println("""x  : Int = """ + $show(x ));$skip(37); 
  val a = if(x > 1) "foo" else "bar";System.out.println("""a  : java.lang.String = """ + $show(a ));$skip(53); 
  println("a: " + a);$skip(59);                               //

  def fooBar(x: Int): String = if(x > 1) "foo" else "bar";System.out.println("""fooBar: (x: Int)String""")}
    
  


}