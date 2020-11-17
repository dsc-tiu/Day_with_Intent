package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class prd_qty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prd_qty)
        val button = findViewById<Button>(R.id.button22)
        button.setOnClickListener {
            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        }
    }
}