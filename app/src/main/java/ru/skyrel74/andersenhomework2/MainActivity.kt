package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val LOG_TAG = MainActivity::class.java.simpleName

    private var mCount = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mShowCount = findViewById(R.id.show_count)

        runCatching { throw Exception("Some message for logging") }
            .onFailure { error -> Log.e(LOG_TAG, error.message) }
    }

    fun showToast(view: View): Unit =
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()

    fun countUp(view: View): Unit {
        mShowCount.text = (++mCount).toString()
    }
}