package ru.siksmfp.kotlin.patterns.behaviour.command.implementation

class Replace(val text: Text, val replace: String, val replacement: String) : Command {
    override fun execute() {
        text.content.replace(replace, replacement)
    }
}