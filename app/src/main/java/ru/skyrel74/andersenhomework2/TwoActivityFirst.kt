package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


const val EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE"
const val TEXT_REQUEST = 1

class TwoActivityFirst : AppCompatActivity(R.layout.activity_two_first) {

    private val LOG_TAG = TwoActivityFirst::class.java.simpleName
    private lateinit var mMessageEditText: EditText
    private lateinit var mReplyHeadTextView: TextView
    private lateinit var mReplyTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")

        mMessageEditText = findViewById(R.id.editText_main)
        mReplyHeadTextView = findViewById(R.id.text_header_reply)
        mReplyTextView = findViewById(R.id.text_message_reply)

        if (savedInstanceState != null) {
            val isVisible = savedInstanceState.getBoolean("reply_visible")
            if (isVisible) {
                mReplyHeadTextView.visibility = View.VISIBLE
                mReplyTextView.text = savedInstanceState.getString("reply_text")
                mReplyTextView.visibility = View.VISIBLE
            }
        }
    }

    fun launchSecondActivity(view: View): Unit {
        Log.d(LOG_TAG, "Button clicked!")
        val intent = Intent(this, TwoActivitySecond::class.java)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK && data != null) {
                val reply: String = data.getStringExtra(EXTRA_REPLY)
                mReplyHeadTextView.visibility = View.VISIBLE
                mReplyTextView.text = reply
                mReplyTextView.visibility = View.VISIBLE
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        if (mReplyHeadTextView.visibility == View.VISIBLE) {
            outState.putBoolean("reply_visible", true)
            outState.putString("reply_text",
                mReplyTextView.text.toString())
        }
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