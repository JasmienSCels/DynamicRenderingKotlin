package com.example.dynamicrenderingkotlin.trivia.Repository

import com.example.dynamicrenderingkotlin.models.Trivia.TriviaQuestions
import retrofit2.Call
import retrofit2.http.GET

interface TriviaDatabaseAPI {

    @GET("/api.php?amount=10")
    fun getTrivaQuestions(): Call<List<TriviaQuestions>>

}