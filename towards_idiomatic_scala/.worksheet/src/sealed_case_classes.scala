object sealed_case_classes {
    sealed abstract class Plant

    case class Fruit(name: String) extends Plant
    case class Vegetable(name: String) extends Plant;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(202); 

    val apple: Plant = Fruit("apple");System.out.println("""apple  : sealed_case_classes.Plant = """ + $show(apple ));$skip(205); 
    def howAboutThisPlant(plant: Plant): String = {
        plant match {
            case Fruit(name) => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        }
    };System.out.println("""howAboutThisPlant: (plant: sealed_case_classes.Plant)String""");$skip(29); val res$0 = 
    howAboutThisPlant(apple);System.out.println("""res0: String = """ + $show(res$0));$skip(418); 
    // 1) didn't have to do an isInstanceOf
    // 2) didn't have to cast plant to a type
    // 3) didn't have to bind the name variable of plant
    // 4) the compiler helped us make sure we covered all possibilities

    def howAboutThisPlant2(plant: Plant): String =
        plant match {
            case Fruit(name) => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        };System.out.println("""howAboutThisPlant2: (plant: sealed_case_classes.Plant)String""")}
    


}