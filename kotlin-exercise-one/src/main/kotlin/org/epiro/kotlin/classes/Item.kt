package org.epiro.kotlin.classes

class Item() {

    var name: String = ""

    constructor(name: String) : this() {
        this.name = name
    }
}

fun main() {
    val item = Item("Sword")
    println("Item: ${item.name}")

    val item2 = Item()
    item2.name = "Shield"
    println("Item: ${item2.name}")
}