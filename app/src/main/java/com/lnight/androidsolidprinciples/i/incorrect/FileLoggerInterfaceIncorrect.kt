package com.lnight.androidsolidprinciples.i.incorrect

import java.io.File

// If some classes that inherited of this interface actually don't need this printLogs
// we should not force it
interface FileLoggerInterfaceIncorrect {

    fun printLogs(file: File)

     fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}

class CustomErrorFileLoggerChildIncorrect: FileLoggerInterfaceIncorrect {

    override fun printLogs(file: File) {
        // we don't need this function
        // and we just leave it with empty body,
        // and it looks ugly
    }

    override fun logError(error: String) {
        val file = File("fatalError.txt")
        file.appendText(
            text = error
        )
    }
}