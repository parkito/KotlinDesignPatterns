package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

import ru.siksmfp.kotlin.patterns.behaviour.chain.implementation.FileType.AVI
import ru.siksmfp.kotlin.patterns.behaviour.chain.implementation.FileType.WMA

class VideoHandler(val nextHandler: Handler) : Handler {
    private val VIDEO_TYPES = listOf(AVI, WMA)

    override fun doProcess(file: File) {
        if (VIDEO_TYPES.contains(file.fileType)) {
            println("File ${file.fileType} is video file. It'll be processed as video file");
        } else {
            nextHandler.doProcess(file);
        }
    }
}
