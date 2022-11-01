package com.belkanoid.hammerssystem_testovoe.presentation

import android.app.Application
import com.belkanoid.hammerssystem_testovoe.di.AppComponent
import com.belkanoid.hammerssystem_testovoe.di.DaggerAppComponent

class App : Application() {

    val component: AppComponent by lazy {
        DaggerAppComponent.create()
    }

}