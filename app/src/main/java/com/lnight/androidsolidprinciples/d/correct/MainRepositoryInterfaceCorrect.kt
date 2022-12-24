package com.lnight.androidsolidprinciples.d.correct

import com.lnight.androidsolidprinciples.s.correct.FileLogger

// Now, we depend on abstraction, and we can easily change the actual implementation
class MainRepositoryInterfaceCorrect(
    private val authenticator: Authenticator,
    private val fileLogger: FileLogger
) {
    suspend fun loginUser(email: String, password: String) {
        try {
            authenticator.signInWithEmailAndPassword(email, password)
        } catch (e: Exception) {
            fileLogger.logError(e.message ?: "Unknown error")
        }
    }
}