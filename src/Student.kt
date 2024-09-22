class Student(val name: String) {

    var age: Int = 17
    var studentNumber: Int = 1312

//  에러
//    constructor(name: String, age: Int) {
//        this.age = age
//    }

    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, studentNumber: Int): this(name, age) {
        this.studentNumber = studentNumber
    }
}