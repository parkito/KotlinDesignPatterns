package ru.siksmfp.kotlin.patterns.behaviour.iterator.implementation

fun main(args: Array<String>) {

    val ci = CarIterator(Car("1", 1.1), Car("2", 2.2), Car("3", 3.3))

    while (ci.hasNext()) {
        println(ci.next())
    }
}