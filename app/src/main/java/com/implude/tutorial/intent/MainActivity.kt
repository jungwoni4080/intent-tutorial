package com.implude.tutorial.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_open: Button = findViewById(R.id.btn_open)
        btn_open.setOnClickListener({
            val intent = Intent(this, AnotherActivity::class.java)
            startActivity(intent)
        })
    }
}