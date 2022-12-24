package com.lnight.androidsolidprinciples.s

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class FirebaseAuth {
    suspend fun signInWithEmailAndPassword(email: String, password: String): Boolean {
       return withContext(CoroutineScope(Dispatchers.IO).coroutineContext) {
           delay(1000L)
           true
       }
    }

}