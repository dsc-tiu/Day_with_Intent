package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class singin_c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin_c)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, shops::class.java)
            startActivity(intent)
        }
    }
}