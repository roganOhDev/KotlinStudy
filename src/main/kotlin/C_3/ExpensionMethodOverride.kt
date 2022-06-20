package C_3

open class View {
    open fun click() = println("C_3.View clicked")
}

class Button: View() {
    override fun click() = println("C_3.Button clicked")
}

fun View.showoff () = println("C_3.View!!")
fun Button.showoff () = println("C_3.View!!")

fun main() {
    val view: View = Button()
    view.showoff()
}