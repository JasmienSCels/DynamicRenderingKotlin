package com.example.dynamicrenderingkotlin.trivia

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.dynamicrenderingkotlin.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: TriviaViewModelFactory

    private lateinit var viewModel :TriviaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(TriviaViewModel::class.java)

        viewModel.getTriviaQuestions()

    }
}
