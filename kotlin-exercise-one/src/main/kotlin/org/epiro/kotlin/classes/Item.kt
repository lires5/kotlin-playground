package org.epiro.kotlin.classes

class Item() {

    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Getting price")
            return field
        }
        set(value) {
            println("Setting price")
            field = value
        }

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

    item2.price = 10.0
    println("Item price: ${item2.price}")
}