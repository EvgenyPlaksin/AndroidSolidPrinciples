package com.lnight.androidsolidprinciples.o.correct

import java.io.File

// Now, as you can see, we can extend this class and make another realization for logError function
open class FileLoggerCorrect {

    open fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}

class CustomErrorFileLogger: FileLoggerCorrect() {

    override fun logError(error: String) {
        val file = File("fatalError.txt")
        file.appendText(
            text = error
        )
    }
}