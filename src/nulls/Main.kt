package nulls

class Wolf {
    var hunger = 10
    val food = "meat"

    fun eat() {
        println("The wolf is eating $food")
    }
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() {
        wolf?.eat()
    }
}

fun getAlphaWolf(): Wolf? {
    return Wolf()
}

fun main() {
    var w: Wolf? = Wolf()

    if (w != null) {
        w.eat()
    }

    var x = w?.hunger
    println("Value of x is $x")

    var y = w?.hunger ?: -1
    println("y = ${y}")

    var myWolf = MyWolf()
    myWolf?.wolf?.hunger = 8
    println("myWolf.wolf.hunger = ${myWolf?.wolf?.hunger}")


    var myArray = arrayOf("hi", "hello", null)
    for (item in myArray) {
        //let to process only non-nulls
        item?.let {
            println(it)
        }
    }

    //This will not compile becuase the compiler thinks getAlphaWolf may be null
    //getAlphaWolf().eat()
    getAlphaWolf()?.let {
        it.eat()
    }
}

