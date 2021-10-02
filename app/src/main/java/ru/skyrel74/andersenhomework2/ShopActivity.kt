package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ShopActivity : AppCompatActivity(R.layout.activity_shop) {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button10: Button
    private lateinit var mLocationEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button10 = findViewById(R.id.button10)
        mLocationEditText = findViewById(R.id.location_edittext)

        button1.setOnClickListener { returnReply(button1.text.toString(), 1) }
        button2.setOnClickListener { returnReply(button2.text.toString(), 2) }
        button3.setOnClickListener { returnReply(button3.text.toString(), 3) }
        button4.setOnClickListener { returnReply(button4.text.toString(), 4) }
        button5.setOnClickListener { returnReply(button5.text.toString(), 5) }
        button6.setOnClickListener { returnReply(button6.text.toString(), 6) }
        button7.setOnClickListener { returnReply(button7.text.toString(), 7) }
        button8.setOnClickListener { returnReply(button8.text.toString(), 8) }
        button9.setOnClickListener { returnReply(button9.text.toString(), 9) }
        button10.setOnClickListener { returnReply(button10.text.toString(), 10) }
    }

    fun returnReply(text: String, count: Int) {
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_MESSAGE_CART, text)
        replyIntent.putExtra(EXTRA_ELEM_COUNT, count)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    fun openLocation(view: View) {
        val loc: String = mLocationEditText.text.toString()
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!")
        }
    }
}