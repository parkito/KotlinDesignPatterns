package ru.siksmfp.kotlin.patterns.behaviour.command.implementation;

@FunctionalInterface
interface Command {

    fun execute();
}
