package com.example.dynamicrenderingkotlin.trivia

import com.example.dynamicrenderingkotlin.BASE_URL
import com.example.dynamicrenderingkotlin.trivia.Repository.TriviaDatabaseAPI
import dagger.Module
import dagger.Provides
import dagger.Reusable
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class TriviaModule {

    @Provides
    @Reusable
    //@JvmStatic
    internal fun provideTriviaDatabaseAPI(retrofit: Retrofit): TriviaDatabaseAPI {
        return retrofit.create(TriviaDatabaseAPI::class.java)
    }

    @Provides
    @Reusable
    //@JvmStatic
    internal fun provideRetrofitInterface(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
}