package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"

class TwoActivitySecond : AppCompatActivity(R.layout.activity_two_second) {

    private lateinit var mReply: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
        finish()
    }
}