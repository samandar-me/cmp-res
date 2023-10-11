package com.sdk.cmpres

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun NativeLoading(modifier: Modifier) {
    CircularProgressIndicator(modifier)
}