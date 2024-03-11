package com.example.builderapp.data

class CoffeeBuilder {
    private var coffeeBeans: String = "Arabica"
    private var doubleCoffee: String? = null
    private var milk: String? = null
    private var coffeeCreamer: String? = null
    private var sugar: String? = null
    private var cinnamon: String? = null
    private var syrup: String? = null

    fun withCoffeeBeans(coffeeBeans: String) = apply { this.coffeeBeans = coffeeBeans }
    fun withDoubleCoffee(doubleCoffee: String?) = apply { this.doubleCoffee = doubleCoffee }
    fun withMilk(milk: String?) = apply { this.milk = milk }
    fun withCoffeeCreamer(coffeeCreamer: String?) = apply { this.coffeeCreamer = coffeeCreamer }
    fun withSugar(sugar: String?) = apply { this.sugar = sugar }
    fun withCinnamon(cinnamon: String?) = apply { this.cinnamon = cinnamon }
    fun withSyrup(syrup: String?) = apply { this.syrup = syrup }

    fun build() = Coffee(
        coffeeBeans,
        doubleCoffee,
        milk,
        coffeeCreamer,
        sugar,
        cinnamon,
        syrup
    )
}