package com.abhi.daggerkotlin.application

import android.app.Application
import com.abhi.daggerkotlin.component.AppComponent
import com.abhi.daggerkotlin.component.DaggerAppComponent

class MyApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .driver("Andrew")
            .build()
    }
}