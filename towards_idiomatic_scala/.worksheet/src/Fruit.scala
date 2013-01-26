    sealed abstract class Plant

    case class Fruit(name: String) extends Plant
    case class Vegetable(name: String) extends Plant

    val apple: Plant = Fruit("apple")

    def howAboutThisPlant(plant: Plant): String = {
        if (plant.isInstanceOf[Fruit]) {
            val fruit: Fruit = plant.asInstanceOf[Fruit]
            "found a fruit: " + fruit.name
        } else if (plant.isInstanceOf[Vegetable]) {
            "didn't expect a veggie"
        } else {
            throw new MatchError("should've used a matcher")
        }
    }
    
    howAboutThisPlant(apple)