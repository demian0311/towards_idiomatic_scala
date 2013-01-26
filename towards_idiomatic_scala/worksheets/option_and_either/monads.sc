object monads {

    // options are monads
    
    val arr: List[List[Option[Int]]] = List(
        List(Some(201), Some(113), None),
        List(Some(761), Some(942), Some(683)),
        List(None, Some(103), Some(824)))         //> arr  : List[List[Option[Int]]] = List(List(Some(201), Some(113), None), List
                                                  //| (Some(761), Some(942), Some(683)), List(None, Some(103), Some(824)))

    def findEven(l: List[List[Option[Int]]]): List[Int] =
        for {
            row <- l
            //foo <- Some(println("row: " + row))
            cell <- row
            cellValue <- cell
            if (cellValue % 2 == 0) // filter
        } yield cellValue                         //> findEven: (l: List[List[Option[Int]]])List[Int]

    findEven(arr)                                 //> res0: List[Int] = List(942, 824)

    def findEven2(arr: List[List[Option[Int]]]): List[Any] = {
      arr.flatMap{row =>
        row.flatMap{cell =>
          cell.map{ cellValue =>
            if(cellValue % 2 == 0) cellValue
          }
        }
      }
    }                                             //> findEven2: (arr: List[List[Option[Int]]])List[Any]
    
    findEven2(arr)                                //> res1: List[Any] = List((), (), (), 942, (), (), 824)

}