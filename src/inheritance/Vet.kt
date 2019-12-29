package inheritance

class Vet {

    fun giveShot(animal: Animal) {
        println("The vet give a shot to ${animal.image}")
        animal.makeNoise()
    }
}