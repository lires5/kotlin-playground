package org.epiro.kotlin.classes.tasks

data class Employee(
    val id: Int,
    val name: String
)

fun main() {
    val employee = Employee(1, "Luis")
    println(employee)

    val employeeSame = Employee(1, "Luis")
    println(employee == employeeSame)

    val employeeCopied = employee.copy(name = "John")
    println(employeeCopied)
}
