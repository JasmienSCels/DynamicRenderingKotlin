package com.example.dynamicrenderingkotlin

import com.example.dynamicrenderingkotlin.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DRKApplication :DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().build()
    }
}