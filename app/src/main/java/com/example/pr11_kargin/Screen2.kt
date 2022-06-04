package com.example.pr11_kargin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }
    fun onClickOpenScreen3(view: View){
        val intent = Intent(this, screen3::class.java)
        startActivity(intent)
    }
}