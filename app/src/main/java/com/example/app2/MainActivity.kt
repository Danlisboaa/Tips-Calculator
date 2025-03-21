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

        var percentage : Int = 0

        binding.rbOptionOne.setOnCheckedChangeListener {_, isChecked ->
            if(isChecked){
                percentage = 10
            }
        }
        binding.rbOptionTwo.setOnCheckedChangeListener{_, isChecked ->
            if(isChecked){
                percentage = 15
            }
        }
        binding.rbOptionThree.setOnCheckedChangeListener {_,isChecked ->
            if(isChecked){
                percentage = 20
            }
        }

        binding.btnClean.setOnClickListener{
            println(binding.totalBill.text)
            println(binding.numPeople.text)

        }
        binding.btnDone.setOnClickListener{
            val totalTable: Float = binding.totalBill.text.toString().toFloat()
            val nPeople: Int = binding.numPeople.text.toString().toInt()
            val totalTemp = totalTable / nPeople
            val totalTips = (totalTemp * percentage) / 100
            val totalWithTips = totalTemp+totalTips
            println(totalWithTips)
        }
    }
}