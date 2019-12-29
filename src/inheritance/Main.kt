package inheritance

fun main() {
    val wolf = Wolf()

    wolf.makeNoise()
    wolf.eat()
    wolf.roam()
    wolf.sleep()

    val vet = Vet()
    vet.giveShot(wolf)

    val hippo = Hippo()
    vet.giveShot(hippo)

    println("Smart Casting")
    val roamables = arrayOf(Wolf(), Hippo(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }

}
