package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

class DefaultHandler : Handler {

    override fun doProcess(file: File) {
        println("There is no handler for ${file.name}");
    }
}