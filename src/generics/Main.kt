package generics

fun main() {
    val catFuzz = Cat("Fuzz lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catFuzz)
    petVet.treat(catFuzz)

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)

    println("Top cat = ${catContest.getWinners().first().name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)

    println("Top pet = ${petContest.getWinners().first().name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()

    petRetailer.sell()

    //Putting in in the Vet class
    //class Vet<in T: Pet> , lets you do
    //  val catVet2: Vet<Cat> = Vet<Pet>()

    //...but remove it from Vet and add it to Contest, prevents this case, but lets you use a Vet<Pet> for a Contest<Cat>


    val fishContest = Contest<Fish>(petVet)


}