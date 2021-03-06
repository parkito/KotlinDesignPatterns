package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

import ru.siksmfp.kotlin.patterns.behaviour.chain.implementation.FileType.MP3

class AudioHandler : Handler {
    private val AUDIO_TYPES = listOf(MP3)
    lateinit var nextHandler: Handler;

    constructor(nextHandler: Handler) {
        this.nextHandler = nextHandler
    }

    constructor()

    override fun doProcess(file: File) {
        if (AUDIO_TYPES.contains(file.fileType)) {
            println("File ${file.fileType} is audio file. It'll be processed as audio file");
        } else {
            nextHandler.doProcess(file);
        }
    }

    override fun combine(handler: Handler): Handler {
        nextHandler = handler
        return nextHandler
    }
}
