package com.example.taskbutton

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editTextET: EditText
    private lateinit var textResult:TextView
    private lateinit var textNumber:TextView
    private lateinit var buttonBT:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        editTextET = findViewById(R.id.editText)
        textResult = findViewById(R.id.textResult)
        textNumber = findViewById(R.id.textNumber)
        buttonBT = findViewById(R.id.buttonBN)

    }

    fun onButtonClick(view: View){
        textResult.text = editTextET.text.reversed()
        textNumber.text = editTextET.text.length.toString()
    }
}