package Class

fun main() {
    var dog1 = Animal("강아지", 5, "개")
    var dog2 = Dog("강아지", 5)
    var cat = Cat("고양이", 6)
    // dog1 인스턴스와 dog2 인스턴스의 속성은 같게 됨.

    // dog2 인스턴스는 Animal을 상속 받으므로 introduce 함수 기능을 사용할 수 있음.
    dog1.introduce()
    dog2.introduce()

    dog2.bark()
    cat.meow()
}

open class Animal (var name: String, var age: Int, var type: String) {
    fun introduce() = println("저는 ${type} ${name}이고, ${age}살 입니다.")

}

class Dog(name: String, age: Int): Animal(name, age, "개") {
    fun bark() = println("멍멍")
}

class Cat(name: String, age: Int): Animal(name, age, "고양이") {
    fun meow() = println("야용")
}

class ClassExtends {

}