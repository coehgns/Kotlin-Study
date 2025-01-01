package ScopeMethod

fun main() {
    var food = Food("Tteokbbokki", 5000).apply {
        name = name
        discount()
    }

    var foodPrice = food.run {
        println("음식 : ${food.name}, 가격 : ${food.price}")
        price + 2000
    }

    var foodPrice2 = with(food) {
        println("음식 : ${food.name}, 가격 : ${food.price}")
        price + 2000
    }

    var price = 9999

    food.let {
        println("음식 : ${it.name}, 가격 : ${it.price}")
    }

    foodPrice.also {
        println("음식 : ${it}, 가격 : ${it}")
    }

    println("현재 가격 : ${foodPrice}")
}

class Food(
    var name: String,
    var price: Int
) {
    fun discount() {
        price -= 2000
    }
}