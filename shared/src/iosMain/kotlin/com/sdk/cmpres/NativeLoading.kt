package com.sdk.cmpres

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.interop.UIKitView
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import platform.UIKit.UIActivityIndicatorView
import platform.UIKit.UIColor

@OptIn(ExperimentalForeignApi::class)
@Composable
actual fun NativeLoading(modifier: Modifier) {
    var loading by remember { mutableStateOf<UIActivityIndicatorView?>(null) }

    LaunchedEffect(Unit) {
        loading = withContext(Dispatchers.Main) {
            UIActivityIndicatorView().apply {
                color = UIColor.blackColor
                startAnimating()
            }
        }
    }
    loading?.let { view ->
        UIKitView(
            modifier = Modifier,
            factory = {
                view
            }
        )
    }
}