package ru.dhlearning.myplayzone

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform