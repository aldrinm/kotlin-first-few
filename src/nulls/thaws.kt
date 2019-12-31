package nulls

import java.lang.Exception

class BadException: Exception()

fun myFunction(test: String) {
    print("t")
    print("h")
    try {
        riskyCode(test)
        print("r")
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
        print("s")
    }
}

fun riskyCode(test: String) {
    if (test == "Yes") {
        throw BadException()
    }

}

fun main() {
    myFunction("Yes")
    myFunction("No")
}