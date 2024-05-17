package com.everton.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.everton.bmicalculator.databinding.ActivityMainBinding
import com.everton.bmicalculator.databinding.ActivityResultScreemBinding

class ResultScreem : AppCompatActivity() {

    private lateinit var binding: ActivityResultScreemBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultScreemBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        

    }
}