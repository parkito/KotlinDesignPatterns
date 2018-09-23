package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

fun main(args: Array<String>) {
    val movie = File("movie", FileType.AVI);
    val audio = File("audio", FileType.MP3);
    val text = File("text", FileType.PDF);
    val unknown = File("unknown", FileType.UNKNOWN);

    val holderCombiner: (List<Handler>) -> Handler = { handlers ->
        for (i in 0..handlers.size - 2) {
            handlers[i].combine(handlers[i + 1])
        }
        handlers.get(0)
    }


    val processor: Handler = holderCombiner(listOf(AudioHandler(), VideoHandler(), DocHandler()));
    processor.doProcess(movie);
    processor.doProcess(audio);
    processor.doProcess(text);
    processor.doProcess(unknown);

//        File movie is video file. It'll be processed as video file
//        File audio is audio file. It'll be processed as audio file
//        File text is doc file. It'll be processed as doc file
//        There is no handler for unknown
}
