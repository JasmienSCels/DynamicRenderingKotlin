package com.example.dynamicrenderingkotlin.models.Trivia

data class TriviaQuestions(
        var responseCode: Int,
        var results: List<Question> ) {


}