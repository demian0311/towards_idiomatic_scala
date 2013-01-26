object sealed_case_classes {
    sealed abstract class Plant

    case class Fruit(name: String) extends Plant
    case class Vegetable(name: String) extends Plant

    val apple: Plant = Fruit("apple")             //> apple  : sealed_case_classes.Plant = Fruit(apple)
    def howAboutThisPlant(plant: Plant): String = {
        plant match {
            case Fruit(name) => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        }
    }                                             //> howAboutThisPlant: (plant: sealed_case_classes.Plant)String
    howAboutThisPlant(apple)                      //> res0: String = found a fruit: apple
    // 1) didn't have to do an isInstanceOf
    // 2) didn't have to cast plant to a type
    // 3) didn't have to bind the name variable of plant
    // 4) the compiler helped us make sure we covered all possibilities

    def howAboutThisPlant2(plant: Plant): String =
        plant match {
            case Fruit(name) => "found a fruit: " + name
            case Vegetable(_) => "didn't expect a veggie"
        }                                         //> howAboutThisPlant2: (plant: sealed_case_classes.Plant)String
    


}