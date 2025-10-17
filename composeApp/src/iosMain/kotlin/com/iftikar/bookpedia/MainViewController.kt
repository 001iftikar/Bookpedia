package com.iftikar.bookpedia

import androidx.compose.ui.window.ComposeUIViewController
import com.iftikar.bookpedia.app.App
import com.iftikar.bookpedia.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }