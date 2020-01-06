package lambdas

fun unless(condition: Boolean, code: () -> Unit ) {
    if (condition) {
        code()
    }
}

fun main() {
    val options = arrayOf("Red", "Amber", "Green")

    var crosswalk = options[(Math.random() * options.size).toInt()]
    if (crosswalk == "Green") {
        println("Walk")
    }
    unless(crosswalk == "Green") {
        println("Stop")
    }
}

