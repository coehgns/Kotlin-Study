package Default

fun main() {
    // while
    var i: Int = 0
    while (i < 10) {
        print("$i ")
        i++
    }
    println()

    // for
    for (j: Int in 0 .. 5) {
        print("$j ")
    }

    println()

    val len: Int = 10
    for (j in 0 .. len) {
        print("$j ")
    }

    println()

    for (j in 0 until len) {
        print("$j ")
    }

    println()

    for (j: Int in 0 .. 10 step(2)) {
        print("$j ")
    }

    println()

    for(i in 10 downTo 1) {
        print("$i ")   // 출력 10 9 8 7 ... 1
    }

    println()

    for(i in 10 downTo  1 step(2)) {
        print("$i ")   // 출력 10 8 6 4 2
    }
}