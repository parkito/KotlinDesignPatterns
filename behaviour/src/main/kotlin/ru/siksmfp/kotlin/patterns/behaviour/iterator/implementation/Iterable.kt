package ru.siksmfp.kotlin.patterns.behaviour.iterator.implementation

interface Iterable<T> {

    fun next(): T

    fun hasNext():Boolean
}