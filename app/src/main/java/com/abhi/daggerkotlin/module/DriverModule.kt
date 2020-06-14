package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.thirdpartyclass.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DriverModule {

    @Provides
    @Singleton
    fun providesDriver(name: String): Driver {
        return Driver(name)
    }
}