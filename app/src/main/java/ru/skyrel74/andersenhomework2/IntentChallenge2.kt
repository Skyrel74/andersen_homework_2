package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IntentChallenge2 : AppCompatActivity(R.layout.activity_intent_challenge_2) {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textView = findViewById(R.id.textView)

        val intent = intent
        textView.text = intent.getStringExtra(TEXT_CONST)
    }
}