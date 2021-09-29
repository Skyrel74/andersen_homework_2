package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val LOG_TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runCatching { throw Exception("Some message for logging") }
            .onFailure { error -> Log.e(LOG_TAG, error.message) }
    }
}