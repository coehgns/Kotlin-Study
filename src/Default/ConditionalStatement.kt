package Default

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

    // when
    val num: Int = 5
    when(num) {
        1 -> println("num은 1입니다.")
        2, 3 -> println("num은 2 또는 3입니다.")
        in 4.. 10 -> println("num은 4와 10 사이에 있습니다.")
    }

    val data: Any = "hello world"
    when(data) {
        is String -> println("${data}는 String 타입입니다.")
        is Int -> println("${data}는 Int 타입입니다.")
        is Boolean -> println("${data}는 Boolean 타입입니다.")
    }

    val num1 = 5
    val result = when{
        num1 == 7 -> println("num1은 5입니다.")
        num1 == 3 -> println("num1은 3입니다.")
        else -> println("num1은 다른 수 입니다.")
    }
    println(result)
}