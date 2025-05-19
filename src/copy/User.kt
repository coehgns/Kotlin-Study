package copy

class User {
    var id = 0
    var name = "copy"

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }
}

fun main() {
    val minsu = User(1, "minsu")
    // map은 minsu 객체의 주소를 참조하고 있음.
    val map = minsu

}