package com.example.kotlincomposemutltiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform