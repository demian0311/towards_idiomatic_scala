object ifStatementAsExpression {

    def colorOfFruit(fruit: String): String = {
        var result: String = null

        if (fruit == "banana") {
            result = "yellow"
        } else if (fruit == "orange") {
            result = "orange"
        }

        result
    }                                             //> colorOfFruit: (fruit: String)String
    assert("yellow" == colorOfFruit("banana"))

    def colorOfFruit0(fruit: String): String = {
        if (fruit == "banana") "yellow"
        else if (fruit == "orange")
            "orange"
        else "UNKOWN"
    }                                             //> colorOfFruit0: (fruit: String)String
    assert("yellow" == colorOfFruit0("banana"))

  

}