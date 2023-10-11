package com.sdk.cmpres

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform