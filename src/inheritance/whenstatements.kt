package inheritance

fun main() {
    val x = 10

    when (x) {
        9 -> println("Just 9")
        10 -> println("Exact 10")
        else -> {
            println("Neither 9 nor 10")
        }
    }

    //As an expression

    println( when(x) {
        9 -> "nine"
        10 -> "ten"
        else -> {
            "neither nine nor ten"
        }
    })

    //Special `is` handling
    val wolf = Wolf()
    when (wolf) {
        is Roamable -> wolf.roam()
        is Animal -> println(wolf.image)
    }
}