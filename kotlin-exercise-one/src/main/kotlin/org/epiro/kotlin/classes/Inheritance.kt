package org.epiro.kotlin.classes

open class User(val name: String) {
    open var isLoggedIn: Boolean = false
    open fun login() {
        println("User $name logged in")
    }
    private fun secret() {
        println("Inside user login")
    }
    protected open fun logout() {
        println("User $name logged out")
    }

}

class Student(name: String) : User (name) {
    override var isLoggedIn: Boolean = false
    override fun login() {
        println("Student $name logged in")
        super.login()
    }

    companion object {
        const val noOfEnrolledCourses = 100
        fun country() = "Kenya"
    }

    public override fun logout() {
        super.logout()
        println("Student $name logged out")
    }
}

class Instructor(name: String) : User (name) {

}

fun main() {
    val student = Student("John")
    val instructor = Instructor("Jane")

    println("Student name: ${student.name}")
    student.login()
    student.isLoggedIn = true

    val studentCountry = Student.country()
    println("Student country: $studentCountry")
    println("Number of enrolled courses: ${Student.noOfEnrolledCourses}")

    println("Is student logged in: ${student.isLoggedIn}")
    println("Instructor name: ${instructor.name}")
    instructor.login()

    val user = User("Epiro")

    student.logout()

}