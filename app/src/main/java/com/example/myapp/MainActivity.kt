package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Membuat delay selama 3 detik sebelum pindah ke activity berikutnya
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OB1Activity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
