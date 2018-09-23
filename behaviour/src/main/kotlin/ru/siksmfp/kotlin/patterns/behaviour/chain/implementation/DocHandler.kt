package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

import ru.siksmfp.kotlin.patterns.behaviour.chain.implementation.FileType.*

class DocHandler(val nextHandler: Handler) : Handler {
    private val DOC_TYPES = listOf(PDF, DOC, DOCX)

    override fun doProcess(file: File) {
        if (DOC_TYPES.contains(file.fileType)) {
            println("File ${file.fileType} is doc file. It'll be processed as doc file");
        } else {
            nextHandler.doProcess(file);
        }
    }
}
