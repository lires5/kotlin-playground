package org.epiro.kotlin.basics

fun main() {
    /*val range = 1 .. 10
    for (i in range) {
        println("Range: $i")
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange) {
        println("Reverse Range: $i")
    }

    for(i in range step 2)  {
        println("Range Step 2: $i")
    }
    */
    exploreWhile()
    exploreDoWhile()
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is: $x")
        x++
    }
}

fun exploreDoWhile() {
    var x = 1
    do {
        println("Value of x is: $x")
        x++
    } while (x < 5)
}