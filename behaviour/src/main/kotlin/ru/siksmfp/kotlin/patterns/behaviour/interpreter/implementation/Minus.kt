package ru.siksmfp.kotlin.patterns.behaviour.interpreter.implementation

class Minus<T : Number>(private val value: T) : Expression<T> {

    override fun calculate(value: T): T {
        return (value.toInt() - this.value.toInt()) as T
    }
}