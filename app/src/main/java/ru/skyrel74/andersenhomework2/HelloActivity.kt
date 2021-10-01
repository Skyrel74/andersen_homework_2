package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelloActivity : AppCompatActivity(R.layout.activity_hello) {

    private lateinit var tvHello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tvHello = findViewById(R.id.textView)

        val intent = intent
        val count = intent.getIntExtra(HELLO_COUNT, 0)
        tvHello.text = "Hello!\n$count"
    }
}