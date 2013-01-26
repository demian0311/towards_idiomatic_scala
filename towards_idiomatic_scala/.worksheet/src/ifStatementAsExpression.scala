object ifStatementAsExpression {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(281); 

    def colorOfFruit(fruit: String): String = {
        var result: String = null

        if (fruit == "banana") {
            result = "yellow"
        } else if (fruit == "orange") {
            result = "orange"
        }

        result
    };System.out.println("""colorOfFruit: (fruit: String)String""");$skip(47); 
    assert("yellow" == colorOfFruit("banana"));$skip(175); 

    def colorOfFruit0(fruit: String): String = {
        if (fruit == "banana") "yellow"
        else if (fruit == "orange")
            "orange"
        else "UNKOWN"
    };System.out.println("""colorOfFruit0: (fruit: String)String""");$skip(48); 
    assert("yellow" == colorOfFruit0("banana"))}

  

}