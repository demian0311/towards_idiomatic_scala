import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach

object using_collections_wrong {
  val vegetables = Vector("asparagus", "brocolli", "cabbage")
                                                  //> vegetables  : scala.collection.immutable.Vector[java.lang.String] = Vector(a
                                                  //| sparagus, brocolli, cabbage)
  

  var hasCabbage: Boolean = false                 //> hasCabbage  : Boolean = false
  for(i <- 0 until vegetables.size){
    if(vegetables(i) == "cabbage"){
      hasCabbage = true
    }
  }
  hasCabbage                                      //> res0: Boolean = true
  

  var hasCabbage2: Boolean = false                //> hasCabbage2  : Boolean = false
  vegetables.foreach{ curr =>
    if(curr == "cabbage"){
      hasCabbage2 = true
    }
  }
  hasCabbage2                                     //> res1: Boolean = true

  !vegetables.forall{_ != "cabbage"}              //> res2: Boolean = true

  vegetables.find(_ == "cabbage") match {
    case Some(_) => true
    case None => false
  }                                               //> res3: Boolean = true

  !vegetables.filter{_ == "cabbage"}.isEmpty      //> res4: Boolean = true
  !vegetables.filterNot{_ != "cabbage"}.isEmpty   //> res5: Boolean = true
  vegetables.exists{_ == "cabbage"}               //> res6: Boolean = true
  vegetables.count{_ == "cabbage"} > 0            //> res7: Boolean = true
  vegetables.contains("cabbage")                  //> res8: Boolean = true
}