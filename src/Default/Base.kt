package Default

// 상속 해줄 클래스는 open이여야 상속을 허용할 수 있음.
open class Base(p: Int)

// 파생 클래스(상속 받을 클래스)
class Derived(p: Int): Base(p)