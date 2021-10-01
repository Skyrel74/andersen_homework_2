package ru.skyrel74.andersenhomework2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.skyrel74.andersenhomework2.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityToolbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)


    }
}