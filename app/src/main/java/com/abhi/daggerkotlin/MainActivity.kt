package com.abhi.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhi.daggerkotlin.component.DaggerCarComponent

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car = DaggerCarComponent.create().getCar()
        car.start()
    }
}
