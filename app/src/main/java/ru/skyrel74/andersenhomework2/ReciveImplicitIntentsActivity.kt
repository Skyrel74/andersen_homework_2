package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReciveImplicitIntentsActivity : AppCompatActivity(R.layout.activity_recive_implicit_intents) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent
        val uri = intent.data
        if (uri != null) {
            val uri_string = getString(R.string.uri_label)
                .toString() + uri.toString()
            val textView = findViewById<TextView>(R.id.text_uri_message)
            textView.text = uri_string
        }
    }
}