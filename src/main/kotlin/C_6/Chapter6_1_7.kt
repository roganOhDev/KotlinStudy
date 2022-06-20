package C_6

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun getEmailName(email: String): String {
    return email.split("@").get(0)
}

fun main() {
    var email: String? = "rogan@chequer.io"
    email?.let { sendEmailTo(it) }
    var emailName: String? = email?.let { getEmailName(it) }
    println(emailName)

    email = null
    email?.let { sendEmailTo(it) }
    emailName = email?.let { getEmailName(it) }
    println(emailName)
    //아무일도 일어나지 않는다.

}