package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val button39 = findViewById<Button>(R.id.button39)
        button39.setOnClickListener {
            val intent = Intent(this, Last::class.java)
            startActivity(intent)
        }
        val button28 = findViewById<Button>(R.id.button28)
        button28.setOnClickListener {
            val intent = Intent(this, cancel::class.java)
            startActivity(intent)
        }
    }
}