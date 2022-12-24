package com.lnight.androidsolidprinciples.s.correct

import com.lnight.androidsolidprinciples.s.FirebaseAuth

class MainRepositoryCorrect(
    private val auth: FirebaseAuth,
    private val fileLogger: FileLogger
) {
    // now this function has only one reason to change, and almost everything is correct
    suspend fun loginUser(email: String, password: String) {
        try {
            auth.signInWithEmailAndPassword(email, password)
        } catch (e: Exception) {
            fileLogger.logError(e.message ?: "Unknown error")
        }
    }
}