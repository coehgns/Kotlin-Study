package Default

fun main() {
        var person = minsu()

    person.eat()
    person.write()
}
abstract class Person {
    abstract fun eat()
    fun write() = println("쓱쓱")
}

class minsu: Person() {
    override fun eat() = println("음식을 먹다.")
}