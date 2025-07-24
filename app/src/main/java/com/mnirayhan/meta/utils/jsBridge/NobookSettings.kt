package com.mnirayhan.meta.utils.jsBridge

import android.webkit.JavascriptInterface
import androidx.compose.runtime.MutableState

class NobookSettings (
    private val settingsToggle: MutableState<Boolean>,
) {
    @JavascriptInterface
    fun onSettingsToggle() {
        settingsToggle.value = true
    }
}