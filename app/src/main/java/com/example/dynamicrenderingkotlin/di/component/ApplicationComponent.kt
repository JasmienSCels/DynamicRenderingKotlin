package com.example.dynamicrenderingkotlin.di.component

import com.example.dynamicrenderingkotlin.DRKApplication
import com.example.dynamicrenderingkotlin.di.modules.AppModule
import com.example.dynamicrenderingkotlin.trivia.TriviaModule
import com.example.dynamicrenderingkotlin.trivia.TriviaViewModel
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, TriviaModule::class])

interface ApplicationComponent: AndroidInjector<DRKApplication> {


    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DRKApplication>()

}