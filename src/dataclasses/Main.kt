package dataclasses

fun findRecipes(title: String = "", ingredient: String = "", isVeg: Boolean = false, difficulty: String = ""): Array<Recipe> {
    return arrayOf(Recipe(title, ingredient, isVeg, difficulty))
}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun addNumbers(a: Double, b: Double): Double {
    return a + b
}

fun main() {
    val recipe = Recipe("Chicken bhuna", "Chicken")

    println("recipe.toString() = ${recipe.toString()}")
    println("recipe.hashCode() = ${recipe.hashCode()}")


    val recipe2 = Recipe("Chicken bhuna", "Chicken")
    println("recipe2.toString() = ${recipe2.toString()}")
    println("recipe2.hashCode() = ${recipe2.hashCode()}")

    println("recipe.equals(recipe2) = ${recipe.equals(recipe2)}")

    //Note == calls the .equals()
    println("recipe == recipe2 = ${recipe == recipe2}")

    //Copy data altering some
    val paneerVariation = recipe.copy(isVeg = true)
    println("paneerVariation = ${paneerVariation}")

    //Destructuring
    val (title, mainIngredient) = paneerVariation
    println("title = ${title}, mainIngredient = ${mainIngredient}")
    //also
    println("paneerVariation.component1 aka title = ${paneerVariation.component1()}")
    println("paneerVariation.component2 aka mainIngredient = ${paneerVariation.component2()}")


    //Named arguments
    val butterchicken = Recipe(mainIngredient = "Chicken", title = "Butter Chicken")
    println("butterchicken = ${butterchicken}")



    val m1 = Mushroom(6, false)
    println("m1 = ${m1}")

    val m2 = Mushroom(true)
    println("m2 = ${m2}")

}