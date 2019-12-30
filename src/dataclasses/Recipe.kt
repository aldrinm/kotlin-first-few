package dataclasses

data class Recipe(val title: String, val mainIngredient: String, val isVeg: Boolean = false, val difficulty: String = "Easy")