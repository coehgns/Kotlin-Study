package Interface

class Player(override val ball: Ball, override val state: State): Soccer, Taekwondo {
    // Kotlin은 override를 붙여야만 합니다.
    override fun kick() {
        println("kick the ball.")
    }

    override fun guard() {
        println("defend oneself.")
    }

    override fun tackle() {
        println("Extend your leg to catch the ball.")
    }
}