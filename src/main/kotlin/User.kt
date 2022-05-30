//fun User.getPassword() : String = this.password
//fun User.getAddress() : String = this.addresss
fun User.getage() : Int = age
fun User.getName() : String = this.name

class User (name: String, age: Int, password: String, address: String){
    var name = name
    var age = age
    private val password = password
    protected val address = address
}

fun main(){
    val user = User("a", 23, "abacb", "Seoul")
//    println(user.getPassword())
//    println(user.getAddress())
    println(user.getage())
    println(user.getName())

}