package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.DieselEngine
import com.abhi.daggerkotlin.Engine
import com.abhi.daggerkotlin.annotation.DieselEngineAnno
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    @Provides
    @DieselEngineAnno
    fun providesDieselEngine(dieselEngine: DieselEngine): Engine = dieselEngine
}