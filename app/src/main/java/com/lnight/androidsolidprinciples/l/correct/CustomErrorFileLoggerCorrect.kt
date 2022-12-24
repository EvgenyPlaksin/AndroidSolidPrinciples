package com.lnight.androidsolidprinciples.l.correct

import com.lnight.androidsolidprinciples.o.correct.FileLoggerCorrect
import java.io.File

// Now we can replace parent class with this child class
class CustomErrorFileLoggerCorrect: FileLoggerCorrect() {

     fun customErrorLog(error: String) {
        val file = File("fatalError.txt")
        file.appendText(
            text = error
        )
    }
}