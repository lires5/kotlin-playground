package org.epiro.kotlin.classes

object Authenticate {

    fun authenticate(user: String, password: String): Unit {
        println("Authenticating user $user")
    }
}

fun main() {
    Authenticate.authenticate("john.doe", "password")
}