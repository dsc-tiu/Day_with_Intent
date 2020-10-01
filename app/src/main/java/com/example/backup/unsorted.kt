package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class unsorted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unsorted)
        val button = findViewById<Button>(R.id.button4)
        button.setOnClickListener {
            val intent = Intent(this, sorted::class.java)
            startActivity(intent)
        }
    }
}