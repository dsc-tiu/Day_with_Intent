package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cancel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cancel)
        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent = Intent(this, shops::class.java)
            startActivity(intent)
        }
        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent = Intent(this, shops::class.java)
            startActivity(intent)
        }
    }
}