package com.everton.bmicalculator


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.everton.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnCalculate.setOnClickListener {

            val intent = Intent(this, ResultScreem::class.java)

            startActivity(intent)

        }

    }
}