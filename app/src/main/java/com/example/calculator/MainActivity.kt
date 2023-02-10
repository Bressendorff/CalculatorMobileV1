package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonAdd.setOnClickListener {
            if (binding.num1.text.toString().isEmpty() || binding.num2.text.toString().isEmpty()) {
                binding.textView.text = "Please fill out fields"
                return@setOnClickListener
            }
            val num1 = binding.num1.text.toString().toDouble()
            val num2 = binding.num2.text.toString().toDouble()
            val result = num1 + num2
            binding.textView.text = result.toString()
        }


    }
}