package org.epiro.kotlin.classes

class Person(val name: String = "Carl", val age: Int = 30) {

    var email: String = ""
    var nameLength: Int = 0

    init {
        println("Init Block")
        nameLength = name.length
    }

    constructor(email: String, name: String, age: Int) : this(name, age) {
        this.email = email
    }

    fun action() {
        println("Person Walks")
    }
}

fun main() {
    val person = Person("Luis", 38)
    person.action()
    println("Name: ${person.name}, Age: ${person.age}")

    val person2 = Person()
    println("Name: ${person2.name}, Age: ${person2.age}")

    val person3 = Person(age = 25)
    println("Name: ${person3.name}, Age: ${person3.age}")

    val person4 = Person(email = "abc@gmail.com", name = "John", age = 45)
    println("Name: ${person4.name}, Age: ${person4.age}, Email: ${person4.email} name length: ${person4.nameLength}")
}