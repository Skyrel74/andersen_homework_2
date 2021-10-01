package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

class TwoActivitySecond : AppCompatActivity(R.layout.activity_two_second) {

    private val LOG_TAG: String = TwoActivitySecond::class.java.simpleName
    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")

        mReply = findViewById(R.id.editText_second)

        val intent = intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.text_message)
        textView.text = message
    }

    fun returnReply(view: View) {
        val reply = mReply.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End TwoActivitySecond")
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }
}