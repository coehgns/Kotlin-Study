fun main() {
    var array1 = arrayOf(1, 2, 3, 4, 5)
    var array2 = arrayOfNulls<Int>(5) // 크기가 5인 비어있는 배열을 생성.

     for(i:Int in 0..<5) {
         println(array1[i])
         println()
         println(array2[i])
     }

    array1[0] = 0

    println(array1[0])
}