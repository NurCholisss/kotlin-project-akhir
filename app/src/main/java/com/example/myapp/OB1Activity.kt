package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OB1Activity : AppCompatActivity() {

    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob1)

        nextButton = findViewById(R.id.nextbutton) // Sesuaikan ID dengan XML

        nextButton.setOnClickListener {
            val intent = Intent(this, OB2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
