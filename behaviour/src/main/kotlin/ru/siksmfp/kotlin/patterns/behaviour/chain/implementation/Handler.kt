package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

@FunctionalInterface
interface Handler {

    fun doProcess(file: File);

    fun combine(handler: Handler): Handler {
        return if (this !== handler) {
            this.combine(handler)
        } else {
            handler
        }
    }
}
