package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun updateMainTextView(view: View) {
        val mainTextEdit = findViewById<EditText>(R.id.mainEditText)
        mainTextEdit.setText("This is a message!")

    }
}