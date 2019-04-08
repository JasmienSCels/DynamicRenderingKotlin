package com.example.dynamicrenderingkotlin.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity

}