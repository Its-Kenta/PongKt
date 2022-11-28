@file:JvmName("Lwjgl3Launcher")

package com.github.kenta.pongkt.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.github.kenta.pongkt.Game
import com.github.kenta.pongkt.source.utils.WINDOW_HEIGHT
import com.github.kenta.pongkt.source.utils.WINDOW_TITLE
import com.github.kenta.pongkt.source.utils.WINDOW_WIDTH

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(Game(), Lwjgl3ApplicationConfiguration().apply {
        setTitle(WINDOW_TITLE)
        useVsync(true)
        setWindowedMode(WINDOW_WIDTH, WINDOW_HEIGHT)
        setResizable(false)
        setForegroundFPS(60)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
