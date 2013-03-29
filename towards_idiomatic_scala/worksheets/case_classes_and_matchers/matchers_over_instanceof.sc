object matchers_over_instanceof {
    sealed abstract class Plant

    case class Fruit(name: String) extends Plant
    case class Vegetable(name: String) extends Plant

    val apple: Plant = Fruit("apple")             //> apple  : matchers_over_instanceof.Plant = Fruit(apple)

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
    }                                             //> howAboutThisPlant: (plant: matchers_over_instanceof.Plant)String
    
    howAboutThisPlant(apple)                      //> res0: String = found a fruit: apple

    def howAboutThisPlant2(plant: Plant): String = {
        plant match {
            case Fruit(name)  => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        }
    }                                             //> howAboutThisPlant2: (plant: matchers_over_instanceof.Plant)String
    
    howAboutThisPlant2(apple)                     //> res1: String = found a fruit: apple


}