package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OB2Activity : AppCompatActivity() {

    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob2)

        // Menghubungkan tombol dengan ID dari layout
        nextButton = findViewById(R.id.nextbutton)

        // Set OnClickListener untuk tombol
        nextButton.setOnClickListener {
            val intent = Intent(this, OB3Activity::class.java) // Pindah ke OB3Activity
            startActivity(intent)
            finish() // Menutup OB2Activity agar tidak bisa kembali
        }
    }
}
