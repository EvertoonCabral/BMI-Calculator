package com.everton.bmicalculator


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.everton.bmicalculator.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.btnCalculate.setOnClickListener {

            val intent = Intent(this, ResultScreem::class.java)


            val weight  = binding.edWeight.text.toString()
            val height  =  binding.edHeight.text.toString()

            Log.i("Teste", "Height is $height and Weight is $weight")


            if (weight.isNotEmpty() && height.isNotEmpty()){

                intent.putExtra("height", height)
                intent.putExtra("weight", weight)


            }

            startActivity(intent)

        }

    }
}