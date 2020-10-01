package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class basic_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_details)
        val button = findViewById<Button>(R.id.button11)
        button.setOnClickListener {
            val intent = Intent(this, enter_details::class.java)
            startActivity(intent)
        }
    }
}