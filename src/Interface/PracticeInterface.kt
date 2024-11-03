package Interface

import kotlin.math.min

fun main() {
    val minsu = Minsu()

    minsu.eat()
    minsu.run()
}
interface Runner {
    fun run()
}

interface Eater {
    fun eat() = println("음식을 먹는다.")
}

class Minsu: Runner, Eater {
    override fun run() {
        println("민수가 달린다.")
    }

    override fun eat() {
        println("민수가 먹는다.")
    }
}