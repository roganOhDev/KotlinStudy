package C_6

import java.awt.event.ActionEvent
import javax.swing.AbstractAction
import javax.swing.JList

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
//    println(s.length)
}

class copyRowAction(val list: JList<String>) : AbstractAction() {
    override fun isEnabled(): Boolean =
        list.selectedValue != null

    override fun actionPerformed(e: ActionEvent?) {
        val value = list.selectedValue!!

    }
}

fun main() {
    ignoreNulls(null)
}