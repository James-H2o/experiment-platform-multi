package com.example.kotlincomposemutltiplatform

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ComposableText(messageText: String){
    Box {
        Text(text = messageText, maxLines = 1)
    }
}
class ComposableMultiPlatform {
    private val platform: Platform = getPlatform()

    fun someMessage(): String {
        return "This should be marquee: Hello, ${platform.name}!"
    }



}
