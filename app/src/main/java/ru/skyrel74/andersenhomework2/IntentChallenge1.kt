package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val TEXT_CONST = "TEXT_CONST"

class IntentChallenge1 : AppCompatActivity(R.layout.activity_intent_challenge_1) {

    private lateinit var button1: Button
    private lateinit var button2: Button
    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)

        val intent = Intent(this, IntentChallenge2::class.java)
        val string = getString(R.string.article_text)

        button1.setOnClickListener {
            intent.putExtra(TEXT_CONST, string.subSequence(0, string.length / 3 - 1))
            startActivity(intent)
        }

        button2.setOnClickListener {
            intent.putExtra(TEXT_CONST,
                string.subSequence(string.length / 3, 2 * string.length / 3 - 1))
            startActivity(intent)
        }

        button3.setOnClickListener {
            intent.putExtra(TEXT_CONST,
                string.subSequence(2 * string.length / 3, string.length - 1))
            startActivity(intent)
        }
    }
}