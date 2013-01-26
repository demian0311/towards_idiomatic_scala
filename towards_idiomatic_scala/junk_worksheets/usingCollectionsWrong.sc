object usingCollectionsWrong {

    /** foreach is a smell
    */
    def sum0(listIn: List[Int]): Int = {
        var sum = 0
        listIn.foreach(sum += _)
        sum
    }                                             //> sum0: (listIn: List[Int])Int
    
    assert(10 == sum0(List.range(1, 5)))

    // you can almost guarantee that if you are using
    // foreach, there is a better way to do what you
    // are attempting in the collections library
    
    // you should feel bad using foreach just as you
    // would using a var
    
    def sum1(listIn: List[Int]): Int = listIn.foldLeft(0)(_ + _)
                                                  //> sum1: (listIn: List[Int])Int
    
    assert(10 == sum1(List.range(1, 5)))

}