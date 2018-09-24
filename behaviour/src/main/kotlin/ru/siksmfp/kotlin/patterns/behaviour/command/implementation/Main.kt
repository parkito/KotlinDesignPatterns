package ru.siksmfp.kotlin.patterns.behaviour.command.implementation

fun main(args: Array<String>) {
    val text = Text("Hello")

    val insertCommand = Insert(text, ", World!")
    val deleteCommand = Delete(text, "!")
    val replaceCommand = Replace(text, ",", "")
    val insertCommandAgain = Insert(text, "World")

    val stack = CommandStack()
    stack.add(listOf(insertCommand, deleteCommand, replaceCommand, insertCommand, insertCommandAgain))
    stack.executeStack()

    println(text.content)

    stack.undo()
    stack.executeStack()

    println(text.content)
}