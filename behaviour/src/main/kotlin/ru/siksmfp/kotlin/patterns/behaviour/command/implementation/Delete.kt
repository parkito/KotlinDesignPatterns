package ru.siksmfp.kotlin.patterns.behaviour.command.implementation

class Delete(val text: Text, val deletion: String) : Command {
    override fun execute() {
        text.content.replace(deletion, "")
    }
}