package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class enter_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_details)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, sk_daily_activity::class.java)
            startActivity(intent)
        }
    }
}