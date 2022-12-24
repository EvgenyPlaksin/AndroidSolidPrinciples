package com.lnight.androidsolidprinciples.s.correct

import java.io.File

class FileLogger {

    fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}