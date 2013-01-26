object prefer_for_comprehensions_to_looping {
    println("Welcome to the Scala worksheet")     //> Welcome to the Scala worksheet

    val oneToFive = List.range(1, 5)              //> oneToFive  : List[Int] = List(1, 2, 3, 4)

    def sumIntsInList0(listIn: List[Int]): Int = {
        var currentSum: Int = 0

        for (i <- 0 until listIn.size) {
            currentSum = currentSum + listIn(i)
        }
        currentSum
    }                                             //> sumIntsInList0: (listIn: List[Int])Int
    sumIntsInList0(oneToFive)                     //> res0: Int = 10

    def sumIntsInList1(listIn: List[Int]): Int = listIn.foldLeft(0)(_ + _)
                                                  //> sumIntsInList1: (listIn: List[Int])Int

    sumIntsInList1(oneToFive)                     //> res1: Int = 10

    def sumIntsInList2(listIn: List[Int]): Int = {
        listIn.foldRight(0)(_ + _)
    }                                             //> sumIntsInList2: (listIn: List[Int])Int

    sumIntsInList2(oneToFive)                     //> res2: Int = 10

    def sumIntsInList3(listIn: List[Int]) = {
        var sum = 0
        listIn.foreach(sum += _)
    }                                             //> sumIntsInList3: (listIn: List[Int])Unit

}