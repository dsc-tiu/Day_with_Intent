package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pressMe:Button = findViewById(R.id.button)
        val username: EditText = findViewById(R.id.editText)

        pressMe.setOnClickListener {
            //explicitIntent(username.text.toString())
            implicitIntent(username.text.toString())
        }
    }

    private  fun explicitIntent(name: String){
        val intent = Intent(this,WelcomeScreen::class.java)

        intent.putExtra("NAME",name)

        startActivity(intent)
    }

    private fun implicitIntent(name:String){
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT,name)

        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent,"Share to"))
    }
}
