package com.example.builderapp.data

data class Coffee(
    val coffeeBeans: String = "Arabica",
    val doubleCoffee: String? = null,
    val milk: String? = null,
    val coffeeCreamer: String? = null,
    val sugar: String? = null,
    val cinnamon: String? = null,
    val syrup: String? = null) {
    override fun toString(): String {
    val coffeeInfo = StringBuilder("Coffee: $coffeeBeans")
        if (doubleCoffee != null) {
            coffeeInfo.append(" (Double)")
        }
        if (milk != null) {
            coffeeInfo.append("\n Milk: $milk")
        }
        if (coffeeCreamer != null) {
            coffeeInfo.append("\n Coffee creamer: $coffeeCreamer")
        }
        if (sugar != null) {
            coffeeInfo.append("\n Sugar: $sugar")
        }
        if (cinnamon != null) {
            coffeeInfo.append("\n Cinnamon: $cinnamon")
        }
        if (syrup != null) {
            coffeeInfo.append("\n Syrup: $syrup")
        }
        return coffeeInfo.toString()
    }
}
