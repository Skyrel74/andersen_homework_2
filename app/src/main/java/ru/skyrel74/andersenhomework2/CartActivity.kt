package ru.skyrel74.andersenhomework2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

const val SHOP_REQUEST = 1
const val EXTRA_MESSAGE_CART = "com.example.android.twoactivities.extra.MESSAGE"
const val EXTRA_ELEM_COUNT = "qweqweqwe"

class CartActivity : AppCompatActivity(R.layout.activity_cart) {

    private lateinit var textView1: TextView
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView
    private lateinit var textView6: TextView
    private lateinit var textView7: TextView
    private lateinit var textView8: TextView
    private lateinit var textView9: TextView
    private lateinit var textView10: TextView
    private lateinit var shopButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)
        textView5 = findViewById(R.id.textView5)
        textView6 = findViewById(R.id.textView6)
        textView7 = findViewById(R.id.textView7)
        textView8 = findViewById(R.id.textView8)
        textView9 = findViewById(R.id.textView9)
        textView10 = findViewById(R.id.textView10)
        shopButton = findViewById(R.id.shop_button)

        if (savedInstanceState != null) {
            val text1 = savedInstanceState.getString("textView1")
            if (text1 != null) {
                textView1.text = text1
            }

            val text2 = savedInstanceState.getString("textView2")
            if (text2 != null) {
                textView2.text = text2
            }

            val text3 = savedInstanceState.getString("textView3")
            if (text3 != null) {
                textView3.text = text3
            }

            val text4 = savedInstanceState.getString("textView4")
            if (text4 != null) {
                textView4.text = text4
            }

            val text5 = savedInstanceState.getString("textView5")
            if (text5 != null) {
                textView5.text = text5
            }

            val text6 = savedInstanceState.getString("textView6")
            if (text6 != null) {
                textView6.text = text6
            }

            val text7 = savedInstanceState.getString("textView7")
            if (text7 != null) {
                textView7.text = text7
            }

            val text8 = savedInstanceState.getString("textView8")
            if (text8 != null) {
                textView8.text = text8
            }

            val text9 = savedInstanceState.getString("textView9")
            if (text9 != null) {
                textView9.text = text9
            }

            val text10 = savedInstanceState.getString("textView10")
            if (text10 != null) {
                textView10.text = text10
            }
        }

        shopButton.setOnClickListener {
            startActivityForResult(Intent(this, ShopActivity::class.java), SHOP_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SHOP_REQUEST) {
            if (resultCode == RESULT_OK && data != null) {
                val count: Int = data.getIntExtra(EXTRA_ELEM_COUNT, 0)
                val reply: String = data.getStringExtra(EXTRA_MESSAGE_CART)
                when (count) {
                    1 -> textView1.text = reply
                    2 -> textView2.text = reply
                    3 -> textView3.text = reply
                    4 -> textView4.text = reply
                    5 -> textView5.text = reply
                    6 -> textView6.text = reply
                    7 -> textView7.text = reply
                    8 -> textView8.text = reply
                    9 -> textView9.text = reply
                    10 -> textView1.text = reply
                }
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        if (!textView1.text.isNullOrEmpty())
            outState.putString("textView1", textView1.text.toString())
        if (!textView2.text.isNullOrEmpty())
            outState.putString("textView2", textView2.text.toString())
        if (!textView3.text.isNullOrEmpty())
            outState.putString("textView3", textView3.text.toString())
        if (!textView4.text.isNullOrEmpty())
            outState.putString("textView4", textView4.text.toString())
        if (!textView5.text.isNullOrEmpty())
            outState.putString("textView5", textView5.text.toString())
        if (!textView6.text.isNullOrEmpty())
            outState.putString("textView6", textView6.text.toString())
        if (!textView7.text.isNullOrEmpty())
            outState.putString("textView7", textView7.text.toString())
        if (!textView8.text.isNullOrEmpty())
            outState.putString("textView8", textView8.text.toString())
        if (!textView9.text.isNullOrEmpty())
            outState.putString("textView9", textView9.text.toString())
        if (!textView10.text.isNullOrEmpty())
            outState.putString("textView10", textView10.text.toString())

    }
}