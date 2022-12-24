package com.lnight.androidsolidprinciples.l.incorrect

import com.lnight.androidsolidprinciples.o.correct.FileLoggerCorrect
import java.io.File

// Now this class can't replace FileLoggerCorrect class, because it does not override the logError method.
// If we add it instead of a parent class, the repository will call the default method of the parent class
class CustomErrorFileLoggerIncorrect: FileLoggerCorrect() {

     fun customErrorLog(error: String) {
        val file = File("fatalError.txt")
        file.appendText(
            text = error
        )
    }
}