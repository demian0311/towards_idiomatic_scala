object prefer_for_comprehensions_to_looping {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(91); 
    println("Welcome to the Scala worksheet");$skip(38); 

    val oneToFive = List.range(1, 5);System.out.println("""oneToFive  : List[Int] = """ + $show(oneToFive ));$skip(209); 

    def sumIntsInList0(listIn: List[Int]): Int = {
        var currentSum: Int = 0

        for (i <- 0 until listIn.size) {
            currentSum = currentSum + listIn(i)
        }
        currentSum
    };System.out.println("""sumIntsInList0: (listIn: List[Int])Int""");$skip(30); val res$0 = 
    sumIntsInList0(oneToFive);System.out.println("""res0: Int = """ + $show(res$0));$skip(76); 

    def sumIntsInList1(listIn: List[Int]): Int = listIn.foldLeft(0)(_ + _);System.out.println("""sumIntsInList1: (listIn: List[Int])Int""");$skip(31); val res$1 = 

    sumIntsInList1(oneToFive);System.out.println("""res1: Int = """ + $show(res$1));$skip(93); 

    def sumIntsInList2(listIn: List[Int]): Int = {
        listIn.foldRight(0)(_ + _)
    };System.out.println("""sumIntsInList2: (listIn: List[Int])Int""");$skip(31); val res$2 = 

    sumIntsInList2(oneToFive);System.out.println("""res2: Int = """ + $show(res$2));$skip(106); 

    def sumIntsInList3(listIn: List[Int]) = {
        var sum = 0
        listIn.foreach(sum += _)
    };System.out.println("""sumIntsInList3: (listIn: List[Int])Unit""")}

}