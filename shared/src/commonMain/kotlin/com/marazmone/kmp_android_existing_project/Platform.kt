package com.marazmone.kmp_android_existing_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform