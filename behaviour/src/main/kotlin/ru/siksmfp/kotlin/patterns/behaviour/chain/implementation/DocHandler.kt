package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

import ru.siksmfp.kotlin.patterns.behaviour.chain.implementation.FileType.*

class DocHandler : Handler {

    private val DOC_TYPES = listOf(PDF, DOC, DOCX)
    lateinit var nextHandler: Handler;

    constructor(nextHandler: Handler) {
        this.nextHandler = nextHandler
    }

    constructor()

    override fun doProcess(file: File) {
        if (DOC_TYPES.contains(file.fileType)) {
            println("File ${file.fileType} is doc file. It'll be processed as doc file");
        } else {
            nextHandler.doProcess(file);
        }
    }

    override fun combine(handler: Handler): Handler {
        nextHandler = handler
        return nextHandler
    }
}
