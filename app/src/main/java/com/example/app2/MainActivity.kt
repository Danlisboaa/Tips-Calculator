package com.example.app2

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.app2.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivity: AppCompatActivity (){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rbOptionOne.setOnCheckedChangeListener {_, isChecked ->
            println("Option one : $isChecked")
        }
        binding.rbOptionTwo.setOnCheckedChangeListener{_, isChecked ->
            println("Option two : $isChecked")
        }
        binding.rbOptionThree.setOnCheckedChangeListener {_,isChecked ->
            println("Option Three : $isChecked")
        }

        binding.btnClean.setOnClickListener{
            println("Daniel 1" + binding.totalBill.text)
            println("Daniel 1" + binding.numPeople.text)

        }
        binding.btnDone.setOnClickListener{
            val total: Float = binding.totalBill.text.toString().toFloat()
            val nPeople: Float = binding.numPeople.text.toString().toFloat()
        }
    }
}