
object for_comprehensions_over_nested_for_loops {

    val arr: Array[Array[Int]] = Array(
        Array(201, 113, 987),
        Array(761, 942, 683),
        Array(384, 103, 824))                     //> arr  : Array[Array[Int]] = Array(Array(201, 113, 987), Array(761, 942, 683),
                                                  //|  Array(384, 103, 824))

    def findEven(arr: Array[Array[Int]]): Seq[Int] = {
        import scala.collection._
        var evenNumbers = mutable.ListBuffer[Int]()
        for (i <- arr) {
            for (j <- i) {
                if (j % 2 == 0) {
                    evenNumbers.append(j)
                }
            }
        }
        evenNumbers
    }                                             //> findEven: (arr: Array[Array[Int]])Seq[Int]

    findEven(arr)                                 //> res0: Seq[Int] = ListBuffer(942, 384, 824)

    def findEven2(arr: Array[Array[Int]]): Seq[Int] =
        for {
            row <- arr
            cell <- row
            if (cell % 2 == 0)
        } yield cell                              //> findEven2: (arr: Array[Array[Int]])Seq[Int]

    findEven2(arr)                                //> res1: Seq[Int] = ArraySeq(942, 384, 824)
}