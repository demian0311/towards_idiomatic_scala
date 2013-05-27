object matchers_over_instanceof {
    sealed abstract class Plant

    case class Fruit(name: String) extends Plant
    case class Vegetable(name: String) extends Plant;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(207); 

    val apple: Plant = Fruit("apple");System.out.println("""apple  : matchers_over_instanceof.Plant = """ + $show(apple ));$skip(392); 

    def howAboutThisPlant(plant: Plant): String = {
        if (plant.isInstanceOf[Fruit]) {
            val fruit: Fruit = plant.asInstanceOf[Fruit]
            "found a fruit: " + fruit.name
        } else if (plant.isInstanceOf[Vegetable]) {
            "didn't expect a veggie"
        } else {
            throw new MatchError(
              "should've used a matcher")
        }
    };System.out.println("""howAboutThisPlant: (plant: matchers_over_instanceof.Plant)String""");$skip(34); val res$0 = 
    
    howAboutThisPlant(apple);System.out.println("""res0: String = """ + $show(res$0));$skip(208); 

    def howAboutThisPlant2(plant: Plant): String = {
        plant match {
            case Fruit(name)  => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        }
    };System.out.println("""howAboutThisPlant2: (plant: matchers_over_instanceof.Plant)String""");$skip(35); val res$1 = 
    
    howAboutThisPlant2(apple);System.out.println("""res1: String = """ + $show(res$1))}


}