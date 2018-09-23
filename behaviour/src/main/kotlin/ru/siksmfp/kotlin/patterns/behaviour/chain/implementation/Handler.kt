package ru.siksmfp.kotlin.patterns.behaviour.chain.implementation;

interface Handler {

    fun doProcess(file: File);

    fun combine(handler: Handler): Handler {
        return if (this !== handler) {
            this.combine(handler)
        } else {
            handler
        }
    }

    companion object Combiner {
        fun holderCombiner(vararg args: Handler): Handler {
            val iterator = args.iterator()
            val previous = iterator.next()
            while (iterator.hasNext()) {
                previous.combine(iterator.next())
            }
            previous.combine(DefaultHandler())

            return args[0]
        }
    }
}
