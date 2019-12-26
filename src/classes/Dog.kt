package classes

//Note; val makes it readonly, var is readwrite
//class definition and constructor are all in one
class Dog(val name: String, weight_param: Int, breed_param: String) {
//with no var/val => no member variable

    //can also init more members like this
    var activities = arrayOf("Walk") //Note: Must initialize props before using them
    lateinit var somepropInitedLater: String;

    init {
        //init block
        println("Init activities = ${activities}")
    }

    var breed = breed_param.toUpperCase()
    init {
        //init block 2
        somepropInitedLater = "ok now"
        println("Init activities = ${activities}, breed = ${breed}, someprop = $somepropInitedLater")
    }


    //WEIRD setter syntax. Not : use `field`
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weight/2.2


    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }

}

fun main() {
    val mydog = Dog("Fido", 70, "Mixed")
    mydog.bark()

    mydog.weight = 10
    mydog.bark()

    println("mydog.breed = ${mydog.breed}")

    println("mydog.weightInKgs = ${mydog.weightInKgs}")

    mydog.weight = -10
    println("mydog.weightInKgs = ${mydog.weightInKgs}")

}


