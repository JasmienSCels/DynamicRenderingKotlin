package com.example.dynamicrenderingkotlin.models.Trivia

import com.example.dynamicrenderingkotlin.models.Question

data class TriviaQuestions(
        var responseCode: Int,
        var results: List<Question> ) {


}