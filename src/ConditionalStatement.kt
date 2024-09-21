fun main() {
    val a: Int = 7
    if(a > 10) {
        println("10보다 큽니다.")
    } else if(a < 10) {
        println("10보다 작습니다.")
    } else {
        println("같습니다.")
    }

    val b: Int = 7
    if (b>10) println("10보다 큽니다") else if(b < 10) println("10도 작습니다.") else println("같습니다.")

    // is를 통한 데이터타입 비교
    val thing: String = "hello world"
    if(thing is String) {
        println("String")
    } else {
        println("not String")
    }
}