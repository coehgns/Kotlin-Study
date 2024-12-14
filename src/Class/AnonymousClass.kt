package Class

import java.sql.Array

interface ClickListener {
    fun onClick()
}

fun main(args: Array) {
    setClickAction(object: ClickListener {
        override fun onClick() {
            println("click!!")
        }
    })
}

fun setClickAction(clickListener: ClickListener) {
    clickListener.onClick()
}