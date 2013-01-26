
object for_comprehensions_over_nested_for_loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(181); 

    val arr: Array[Array[Int]] = Array(
        Array(201, 113, 987),
        Array(761, 942, 683),
        Array(384, 103, 824));System.out.println("""arr  : Array[Array[Int]] = """ + $show(arr ));$skip(338); 

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
    };System.out.println("""findEven: (arr: Array[Array[Int]])Seq[Int]""");$skip(19); val res$0 = 

    findEven(arr);System.out.println("""res0: Seq[Int] = """ + $show(res$0));$skip(168); 

    def findEven2(arr: Array[Array[Int]]): Seq[Int] =
        for {
            row <- arr
            cell <- row
            if (cell % 2 == 0)
        } yield cell;System.out.println("""findEven2: (arr: Array[Array[Int]])Seq[Int]""");$skip(20); val res$1 = 

    findEven2(arr);System.out.println("""res1: Seq[Int] = """ + $show(res$1))}
}