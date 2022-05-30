open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showoff () = println("View!!")
fun Button.showoff () = println("View!!")

fun main() {
    val view: View = Button()
    view.showoff()
}