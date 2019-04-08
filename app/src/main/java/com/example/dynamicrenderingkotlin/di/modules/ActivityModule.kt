package com.example.dynamicrenderingkotlin.di.modules

import com.example.dynamicrenderingkotlin.trivia.MainActivity
import com.example.dynamicrenderingkotlin.trivia.TriviaModule
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector

@Module(includes = [AndroidInjectionModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector(modules=[(TriviaModule::class)])
    internal abstract fun contributeMainActiviry(): MainActivity

}