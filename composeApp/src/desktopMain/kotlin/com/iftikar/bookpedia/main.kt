package com.iftikar.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.iftikar.bookpedia.app.App
import com.iftikar.bookpedia.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}