package ru.skyrel74.andersenhomework2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val COUNT_TAG = "COUNT"

class CountActivity : AppCompatActivity(R.layout.activity_count) {

    private lateinit var tvCount: TextView
    private lateinit var btnCount: Button
    private lateinit var editText: EditText
    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tvCount = findViewById(R.id.tvCount)
        btnCount = findViewById(R.id.btnCount)
        editText = findViewById(R.id.editText)

        if (savedInstanceState != null) {
            mCount = savedInstanceState.getInt(COUNT_TAG)
            tvCount.text = mCount.toString()
        }
    }

    fun countUp(view: View) {
        tvCount.text = (++mCount).toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt(COUNT_TAG, mCount)
    }
}