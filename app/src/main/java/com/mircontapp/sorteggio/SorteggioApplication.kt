package com.mircontapp.sorteggio

import android.app.Application

class SorteggioApplication: Application() {
    companion object {
        lateinit var instance: SorteggioApplication
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()

    }
}