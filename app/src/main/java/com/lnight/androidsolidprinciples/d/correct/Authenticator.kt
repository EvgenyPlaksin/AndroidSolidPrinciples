package com.lnight.androidsolidprinciples.d.correct

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.random.Random

interface Authenticator {

    suspend fun signInWithEmailAndPassword(email: String, password: String): Boolean

}

// example of implementation
class FirebaseAuthenticator(): Authenticator {
    override suspend fun signInWithEmailAndPassword(email: String, password: String): Boolean {
        return withContext(CoroutineScope(Dispatchers.IO).coroutineContext) {
            delay(1000L)
            true
        }
    }
}

// another example
class ApiAuthenticator(): Authenticator {
    override suspend fun signInWithEmailAndPassword(email: String, password: String): Boolean {
        return withContext(CoroutineScope(Dispatchers.IO).coroutineContext) {
            delay(2000L)
            Random.nextBoolean()
        }
    }
}