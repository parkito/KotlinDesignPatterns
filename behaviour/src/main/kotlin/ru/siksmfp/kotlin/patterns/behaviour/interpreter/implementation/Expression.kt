package ru.siksmfp.kotlin.patterns.behaviour.interpreter.implementation

interface Expression<T> {
    fun calculate(value: T): T

}