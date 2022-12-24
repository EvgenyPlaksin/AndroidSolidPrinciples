package com.lnight.androidsolidprinciples.i.correct

import java.io.File

interface FileLoggerInterfaceCorrect {

    fun printLogs(file: File) {
        // default behavior
    }

    fun logError(error: String) {
        val file = File("error.txt")
        file.appendText(
            text = error
        )
    }
}

class CustomErrorFileLoggerChildCorrect : FileLoggerInterfaceCorrect {

// now we don't need to override this function
//    override fun printLogs(file: File) {
//
//    }

    override fun logError(error: String) {
        val file = File("fatalError.txt")
        file.appendText(
            text = error
        )
    }
}