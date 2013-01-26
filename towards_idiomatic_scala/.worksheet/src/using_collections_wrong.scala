import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object using_collections_wrong {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(159); 
  val vegetables = Vector("asparagus", "brocolli", "cabbage");System.out.println("""vegetables  : scala.collection.immutable.Vector[java.lang.String] = """ + $show(vegetables ));$skip(38); 
  

  var hasCabbage: Boolean = false;System.out.println("""hasCabbage  : Boolean = """ + $show(hasCabbage ));$skip(103); 
  for(i <- 0 until vegetables.size){
    if(vegetables(i) == "cabbage"){
      hasCabbage = true
    }
  };$skip(17); val res$0 = 
  hasCabbage;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(39); 
  

  var hasCabbage2: Boolean = false;System.out.println("""hasCabbage2  : Boolean = """ + $show(hasCabbage2 ));$skip(92); 
  vegetables.foreach{ curr =>
    if(curr == "cabbage"){
      hasCabbage2 = true
    }
  };$skip(14); val res$1 = 
  hasCabbage2;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(38); val res$2 = 

  !vegetables.forall{_ != "cabbage"};System.out.println("""res2: Boolean = """ + $show(res$2));$skip(95); val res$3 = 

  vegetables.find(_ == "cabbage") match {
    case Some(_) => true
    case None => false
  };System.out.println("""res3: Boolean = """ + $show(res$3));$skip(46); val res$4 = 

  !vegetables.filter{_ == "cabbage"}.isEmpty;System.out.println("""res4: Boolean = """ + $show(res$4));$skip(48); val res$5 = 
  !vegetables.filterNot{_ != "cabbage"}.isEmpty;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(36); val res$6 = 
  vegetables.exists{_ == "cabbage"};System.out.println("""res6: Boolean = """ + $show(res$6));$skip(39); val res$7 = 
  vegetables.count{_ == "cabbage"} > 0;System.out.println("""res7: Boolean = """ + $show(res$7));$skip(33); val res$8 = 
  vegetables.contains("cabbage");System.out.println("""res8: Boolean = """ + $show(res$8))}
}