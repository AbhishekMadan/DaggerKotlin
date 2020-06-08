package com.abhi.daggerkotlin.module

import com.abhi.daggerkotlin.Engine
import com.abhi.daggerkotlin.PetrolEngine
import com.abhi.daggerkotlin.annotation.PetrolEngineAnno
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PetrolEngineModule {

    @Provides
    @Singleton
    @PetrolEngineAnno
    fun providesPetrolEngine(capacity: Int): Engine {
        return PetrolEngine(capacity)
    }
}