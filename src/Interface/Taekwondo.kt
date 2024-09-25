package Interface

import javax.swing.plaf.nimbus.State

interface Taekwondo {
    val state: State

    fun kick() = println("do a kick.")
    fun guard()
}