package com.example.dynamicrenderingkotlin.trivia

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.dynamicrenderingkotlin.trivia.Repository.TriviaApiRepository
import javax.inject.Inject


class TriviaViewModelFactory : ViewModelProvider.Factory {

    @Inject
    constructor(triviaApiRepository: TriviaApiRepository)

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(TriviaViewModel::class.java)){
            return   TriviaViewModel() as T
        }

        throw IllegalArgumentException("Unknown ViewModel class")
    }
}