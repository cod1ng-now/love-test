package com.example.lovingtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: AppCompatButton = findViewById(R.id.btn)
        val girl: EditText = findViewById(R.id.edt_girl)
        val boy: EditText = findViewById(R.id.edt_boy)

        btn.setOnClickListener {
            if (girl.text.toString() == "" || boy.text.toString() == ""){
                Toast.makeText(this, "Boy Name or Girl Name is Empty", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}