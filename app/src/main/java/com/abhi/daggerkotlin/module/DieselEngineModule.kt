package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.DieselEngine
import com.abhi.daggerkotlin.Engine
import com.abhi.daggerkotlin.annotation.DieselEngineAnno
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DieselEngineModule {

    @Provides
    @DieselEngineAnno
    @Singleton
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine = dieselEngine
}