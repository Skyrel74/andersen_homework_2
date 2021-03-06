package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

const val HELLO_COUNT = "ru.skyrel74.andersenhomework2.extra.COUNT"

class ToastActivity : AppCompatActivity(R.layout.activity_toast) {

    private val LOG_TAG = ToastActivity::class.java.simpleName

    private var mCount = 0
    private lateinit var mShowCount: TextView
    private lateinit var mButtonZero: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mShowCount = findViewById(R.id.show_count)
        mButtonZero = findViewById(R.id.button_zero)

        runCatching { throw Exception("Some message for logging") }
            .onFailure { error -> Log.e(LOG_TAG, error.message) }

    }

    fun showHello(view: View): Unit {
        val intent = Intent(this, HelloActivity::class.java)
        intent.putExtra(HELLO_COUNT, mCount)

        startActivity(intent)
    }

    fun showToast(view: View): Unit =
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()

    fun countUp(view: View): Unit {
        mShowCount.text = (++mCount).toString()

        val color = if (mCount % 2 == 0) {
            Color.RED
        } else {
            Color.GREEN
        }
        view.setBackgroundColor(color)

        if (mCount > 0) {
            mButtonZero.setBackgroundColor(Color.CYAN)
        }
    }

    fun zeroize(view: View): Unit {
        mCount = 0
        mShowCount.text = mCount.toString()
    }
}