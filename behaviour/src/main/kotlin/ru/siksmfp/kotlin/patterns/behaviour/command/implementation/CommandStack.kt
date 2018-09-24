package ru.siksmfp.kotlin.patterns.behaviour.command.implementation

class CommandStack {
    val stack = ArrayList<Command>()

    fun add(command: List<Command>) {
        stack.addAll(command)
    }

    fun undo() {
        stack.removeAt(stack.size - 1)
    }

    fun executeStack() {
        for (command in stack) {
            command.execute()
        }
    }
}