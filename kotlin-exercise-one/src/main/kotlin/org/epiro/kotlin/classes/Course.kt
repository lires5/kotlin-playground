package org.epiro.kotlin.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(1, "Kotlin", "Epiro")
    println("Course: ${course.name}, Author: ${course.author}")
    println(course)

    val courseCopied = course.copy(author = "Oracle")
    println(courseCopied)
}
