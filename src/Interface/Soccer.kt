package Interface


interface Soccer {
    val ball: Ball
        get() = Ball()
    fun kick()

    // 자바와 달리 default 키워드 필요 X.
    fun throwIn() = println("throw the ball with both hands.")
    fun tackle() = println("Extend your leg to catch the ball.")
}