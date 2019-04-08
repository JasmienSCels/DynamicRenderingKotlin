package com.example.dynamicrenderingkotlin.trivia

import android.arch.lifecycle.MutableLiveData
import com.example.dynamicrenderingkotlin.base.BaseViewModel
import com.example.dynamicrenderingkotlin.models.Trivia.TriviaQuestions
import com.example.dynamicrenderingkotlin.trivia.Repository.TriviaApiRepository

class TriviaViewModel : BaseViewModel() {

    lateinit var triviaAPIRepository: TriviaApiRepository

    internal fun getTriviaQuestions() : MutableLiveData<TriviaQuestions>? {
        return null
    }

}