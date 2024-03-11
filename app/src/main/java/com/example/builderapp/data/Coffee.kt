package com.example.builderapp.data

class Coffee private constructor (
    var coffeeBeans: String? = "Arabica",
    var doubleCoffee: String?,
    var milk: String?,
    var coffeeCreamer: String?,
    var sugar: String?,
    var cinnamon: String?,
    var syrup: String?) {
    data class Builder (
        var coffeeBeans: String? = null,
        var doubleCoffee: String? = null,
        var milk: String? = null,
        var coffeeCreamer: String? = null,
        var sugar: String? = null,
        var cinnamon: String? = null,
        var syrup: String? = null) {

        private fun coffeeBeans(coffeeBeans: String) = apply { this.coffeeBeans = coffeeBeans }
        private fun doubleCoffee(doubleCoffee: String) = apply { this.doubleCoffee = doubleCoffee }
        private fun milk(milk: String) = apply { this.milk = milk }
        private fun coffeeCreamer(coffeeCreamer: String) = apply { this.coffeeCreamer = coffeeCreamer }
        private fun sugar(sugar: String) = apply { this.sugar = sugar }
        private fun cinnamon(cinnamon: String) = apply { this.cinnamon = cinnamon}
        private fun syrup(syrup: String) = apply { this.syrup = syrup }
        private fun build() = Coffee(coffeeBeans, doubleCoffee, milk, coffeeCreamer, sugar, cinnamon, syrup)
        fun randomBuild() = coffeeBeans(coffeeBeans ?: "Robusta")
            .doubleCoffee(doubleCoffee ?: "Double")
            .milk(milk ?: "Oat")
            .coffeeCreamer(coffeeCreamer ?: "French Vanilla")
            .sugar(sugar ?: "No sugar")
            .cinnamon(cinnamon ?: "Ceylon")
            .syrup(syrup ?: "Chocolate syrup")
            .build()
    }
}