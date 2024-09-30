package AccessModifier

class AccessModifier {
    private fun run() { } // AccessModifier에서만 접근 가능.
    public fun jump() { } // 모든 파일에서 접근 가능.(아무것도 쓰지 않을 경우 public.)
    protected fun sit() { } // 클래스 자신과 상속받은 클래스 접근 가능.
}