package com.example

import io.ktor.auth.*
import java.io.Serializable

data class User(
    val UserID: Int,
    val email: String,
    val displayName: String,
    val passwordHaha: String
) : Serializable, Principal