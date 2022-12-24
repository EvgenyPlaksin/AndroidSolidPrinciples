package com.lnight.androidsolidprinciples.d.incorrect

import com.lnight.androidsolidprinciples.s.FirebaseAuth
import com.lnight.androidsolidprinciples.s.correct.FileLogger
import java.io.File

// We don't want to depend on this class, of concrete implementation of authentication
// If we would decided to change authentication process then we can't do it with this
// repository, because it just force us to use firebase
class MainRepositoryInterfaceIncorrect(
    private val auth: FirebaseAuth,
    private val fileLogger: FileLogger
) {
    suspend fun loginUser(email: String, password: String) {
        try {
            auth.signInWithEmailAndPassword(email, password)
        } catch (e: Exception) {
            fileLogger.logError(e.message ?: "Unknown error")
        }
    }
}