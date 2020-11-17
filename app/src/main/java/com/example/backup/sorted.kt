package com.example.backup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sorted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorted)

        val button = findViewById<Button>(R.id.button33)
        button.setOnClickListener {
            val intent = Intent(this, product_list::class.java)
            startActivity(intent)
        }
    }
}