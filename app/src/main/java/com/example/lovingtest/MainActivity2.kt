package com.example.lovingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val nm = (1..100).random()
        val tw: TextView = findViewById(R.id.textView)
        tw.text = "your love is $nm%"
    }
}