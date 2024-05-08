package org.epiro.kotlin.cast

import org.epiro.kotlin.classes.Course

fun checkType(obj: Any) {
    when (obj) {
        is Course -> println("Course")
        is String -> println("String")
        is Int -> println("Int")
        else -> println("Unknown")
    }
}

fun castNumber(number: Any) {
    when (number) {
        number as Double -> println("Double")
    }

}

fun main() {
    val course = Course(1, "Kotlin", "Epiro")
    checkType(course)
    checkType("Hello")

    castNumber(1.0)
    val number: Int = 1
    castNumber(number.toDouble())
}