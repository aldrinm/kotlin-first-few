fun main() {

    //Use if to return a value
    println (ifReturnsValue())
}

fun ifReturnsValue(): String {
    val n = 10

    val observation = (if (n < 50) {
        "Less than 50"
    }     else  {
        //ALWAYS needs an else when used in an expression
        "More than 50"
    } )

    return observation
}
