object monads {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(223); 

    // options are monads
    
    val arr: List[List[Option[Int]]] = List(
        List(Some(201), Some(113), None),
        List(Some(761), Some(942), Some(683)),
        List(None, Some(103), Some(824)));System.out.println("""arr  : List[List[Option[Int]]] = """ + $show(arr ));$skip(270); 

    def findEven(l: List[List[Option[Int]]]): List[Int] =
        for {
            row <- l
            //foo <- Some(println("row: " + row))
            cell <- row
            cellValue <- cell
            if (cellValue % 2 == 0) // filter
        } yield cellValue;System.out.println("""findEven: (l: List[List[Option[Int]]])List[Int]""");$skip(19); val res$0 = 

    findEven(arr);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(231); 

    def findEven2(arr: List[List[Option[Int]]]): List[Any] = {
      arr.flatMap{row =>
        row.flatMap{cell =>
          cell.map{ cellValue =>
            if(cellValue % 2 == 0) cellValue
          }
        }
      }
    };System.out.println("""findEven2: (arr: List[List[Option[Int]]])List[Any]""");$skip(24); val res$1 = 
    
    findEven2(arr);System.out.println("""res1: List[Any] = """ + $show(res$1))}

}