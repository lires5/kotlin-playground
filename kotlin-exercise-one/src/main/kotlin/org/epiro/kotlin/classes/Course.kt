package org.epiro.kotlin.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    val category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, "Kotlin", "Epiro")
    println("Course: ${course.name}, Author: ${course.author}")
    println(course)

    val courseCopied = course.copy(author = "Oracle", category = CourseCategory.BUSINESS)
    println(courseCopied)
}
