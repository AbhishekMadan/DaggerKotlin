package com.abhi.daggerkotlin.component

import com.abhi.daggerkotlin.MainActivity
import dagger.Component

@Component
interface CarComponent {

    fun inject(mainActivity: MainActivity)
}