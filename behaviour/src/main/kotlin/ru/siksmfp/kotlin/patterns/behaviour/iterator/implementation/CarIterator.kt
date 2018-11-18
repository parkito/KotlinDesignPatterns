package ru.siksmfp.kotlin.patterns.behaviour.iterator.implementation

class CarIterator(vararg val cars: Car) : Iterable<Car> {

    var currentPosition: Int = 0

    override fun next(): Car {
        return if (currentPosition < cars.size) {
            cars[currentPosition++]
        } else {
            throw IllegalArgumentException("Position is not correct")
        }
    }

    override fun hasNext(): Boolean {
        return currentPosition < cars.size
    }
}