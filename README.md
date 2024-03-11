**Task:** Implement the Builder pattern to create coffee. Coffee can consist of:

* Coffee
* Double coffee
* Milk
* Cream
* Sugar
* Cinnamon
* Syrup

**Language:** Kotlin

**Description:**

The Builder pattern allows you to create complex objects step-by-step, using separate methods to add each component. This makes the code more readable and easier to maintain.

In this example, the Builder pattern is used to create coffee. The `CoffeeBuilder` class contains methods for adding each ingredient:

* `withCoffeeBeans()`
* `withDoubleCoffee()`
* `withMilk()`
* `withCream()`
* `withSugar()`
* `withCinnamon()`
* `withSyrup()`

Once all the ingredients have been added, you can call the `build()` method to get the finished `Coffee` object.

**Usage example:**

```kotlin
val coffeeBuilder = CoffeeBuilder()
coffeeBuilder.withCoffeeBeans()
coffeeBuilder.withMilk()
coffeeBuilder.withSugar()

val coffee = coffeeBuilder.build()

println(coffee) // "Coffee with milk and sugar"
```

**Advantages:**

* Increased code readability
* Ease of maintenance
* Ability to create complex objects step-by-step
* Flexibility in configuring the object

**Disadvantages:**

* Need to create additional classes
* Some code bloat

**Comparison with other patterns:**

* **Factory method:** Allows you to create objects of different types, but is not suitable for creating complex objects with many parameters.
* **Abstract factory:** Allows you to create objects of different types, but does not provide step-by-step construction.
* **Prototype:** Allows you to create new objects by cloning an existing object, but is not suitable for creating objects with a dynamically changing composition.

**Conclusion:**

The Builder pattern is an effective tool for creating complex objects. It allows you to make the code more readable, maintainable, and flexible.

**References:**

* Builder pattern: [https://refactoring.guru/design-patterns/builder](https://refactoring.guru/design-patterns/builder)
* Kotlin: [https://kotlinlang.org/](https://kotlinlang.org/)


**Russian version**
**Задача:** Реализовать паттерн Builder для создания кофе. Кофе может состоять из:

* Кофе
* Двойной кофе
* Молоко
* Сливки
* Сахар
* Корица
* Сироп

**Язык:** Kotlin

**Описание:**

Паттерн Builder позволяет создавать сложные объекты пошагово, используя отдельные методы для добавления каждого компонента. Это делает код более читаемым и удобным для сопровождения.

В данном примере паттерн Builder используется для создания кофе. Класс `CoffeeBuilder` содержит методы для добавления каждого ингредиента:

* `withCoffeeBeans()`
* `withDoubleCoffee()`
* `withMilk()`
* `withCream()`
* `withSugar()`
* `withCinnamon()`
* `withSyrup()`

После того, как все ингредиенты добавлены, можно вызвать метод `build()`, чтобы получить готовый объект `Coffee`.

**Пример использования:**

```kotlin
val coffeeBuilder = CoffeeBuilder()
coffeeBuilder.addCoffee()
coffeeBuilder.addMilk()
coffeeBuilder.addSugar()

val coffee = coffeeBuilder.build()

println(coffee) // "Кофе с молоком и сахаром"
```

**Преимущества:**

* Повышение читаемости кода
* Удобство сопровождения
* Возможность создавать сложные объекты пошагово
* Гибкость при настройке объекта

**Недостатки:**

* Необходимость создания дополнительных классов
* Некоторое увеличение объема кода

**Сравнение с другими паттернами:**

* **Фабричный метод:** Позволяет создавать объекты разных типов, но не подходит для создания сложных объектов с множеством параметров.
* **Абстрактная фабрика:** Позволяет создавать объекты разных типов, но не обеспечивает пошагового конструирования.
* **Прототип:** Позволяет создавать новые объекты путем клонирования существующего объекта, но не подходит для создания объектов с динамически меняющимся составом.

**Заключение:**

Паттерн Builder является эффективным инструментом для создания сложных объектов. Он позволяет сделать код более читаемым, удобным для сопровождения и гибким.

**Ссылки:**

* Паттерн Builder: [https://refactoring.guru/ru/design-patterns/builder](https://refactoring.guru/ru/design-patterns/builder)
* Kotlin: [https://kotlinlang.org/](https://kotlinlang.org/)
