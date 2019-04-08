package com.example.dynamicrenderingkotlin.models.Trivia

data class Question(
        var category: String,
        var type: String,
        var difficulty: String,
        var question: String,
        var correctAnswer: String,
        var incorrectAnswers: List<String> ) {
}