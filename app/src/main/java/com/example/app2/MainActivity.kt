package com.example.app2

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnDone =findViewById<Button>(R.id.btn_done)
        val edtBill = findViewById<TextInputEditText>(R.id.total_bill)
        val edtNumPeople = findViewById<TextInputEditText>(R.id.num_people)



        btnClean.setOnClickListener{

        }
    }
}