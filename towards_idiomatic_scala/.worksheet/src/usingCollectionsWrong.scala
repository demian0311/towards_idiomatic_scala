object usingCollectionsWrong {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(177); 

    /** foreach is a smell
    */
    def sum0(listIn: List[Int]): Int = {
        var sum = 0
        listIn.foreach(sum += _)
        sum
    };System.out.println("""sum0: (listIn: List[Int])Int""");$skip(46); 
    
    assert(10 == sum0(List.range(1, 5)));$skip(310); 

    // you can almost guarantee that if you are using
    // foreach, there is a better way to do what you
    // are attempting in the collections library
    
    // you should feel bad using foreach just as you
    // would using a var
    
    def sum1(listIn: List[Int]): Int = listIn.foldLeft(0)(_ + _);System.out.println("""sum1: (listIn: List[Int])Int""");$skip(46); 
    
    assert(10 == sum1(List.range(1, 5)))}

}