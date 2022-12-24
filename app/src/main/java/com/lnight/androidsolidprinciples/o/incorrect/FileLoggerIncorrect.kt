package com.lnight.androidsolidprinciples.o.incorrect

import java.io.File

// Classes should be open for extension but close for modification.
// For example, if I want to change the name of file with error, and I just change it here every class
// that use this FileLogger will change the file name. Usually we don't want to affect our whole code
// with just one change.
class FileLoggerIncorrect {

    fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}