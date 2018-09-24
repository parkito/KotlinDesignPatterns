package ru.siksmfp.kotlin.patterns.behaviour.command.implementation

class Insert(val text: Text, val additionString: String) : Command {
    override fun execute() {
        text.content = text.content + additionString
    }
}