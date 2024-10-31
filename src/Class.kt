fun main() {
    val a = Person("지도현", 3)
    val b = Person("최민수", 4)

    a.introduction()
    b.introduction()
}

class Person(var name: String, var age: Int) {
    fun introduction() {
        println("이름 : ${name}, 나이 : ${age}")
    }
}