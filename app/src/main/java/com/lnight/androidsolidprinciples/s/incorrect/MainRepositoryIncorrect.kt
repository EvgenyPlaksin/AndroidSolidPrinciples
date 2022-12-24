package com.lnight.androidsolidprinciples.s.incorrect

import com.lnight.androidsolidprinciples.s.FirebaseAuth
import java.io.File

class MainRepositoryIncorrect(
    private val auth: FirebaseAuth
) {
    // this function has 2 reasons to change, and that violates the S (single responsibility) principle
    suspend fun loginUser(email: String, password: String) {
        try {
            auth.signInWithEmailAndPassword(email, password)
        } catch (e: Exception) {
            val file = File("error.txt")
            file.appendText(
                text = e.message ?: "Unknown error"
            )
        }
    }
}