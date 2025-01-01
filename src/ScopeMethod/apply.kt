package ScopeMethod

fun main() {
    var food = Food("Tteokbbokki", 5000).apply {
        name = name
        discount()
    }

    println("음식 : ${food.name}, 가격 : ${food.price}")
}

class Food(
    var name: String,
    var price: Int
) {
    fun discount() {
        price -= 2000
    }
}