package extensions

fun Double.toDollar(): String {
    return "$$this"
}

fun main() {
    val pocket = 23.5

    println("pocket = ${pocket}")
    println("pocket.toDollar() = ${pocket.toDollar()}")
}