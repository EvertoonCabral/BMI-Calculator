package com.everton.bmicalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.everton.bmicalculator.databinding.ActivityMainBinding
import com.everton.bmicalculator.databinding.ActivityResultScreemBinding

class ResultScreem : AppCompatActivity() {

    private lateinit var binding: ActivityResultScreemBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultScreemBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val bundle = intent.extras
        if( bundle != null ){

            var weight = bundle.getString("weight")
            var height = bundle.getString("height")

            Log.i("Teste ResultScreem", "Height is $height and Weight is $weight")


            binding.txtWeight.text = "Peso informado $weight kg"
            binding.txtHeight.text  = "Altura informada $height m"


            val imc = weight!!.toDouble() / (height!!.toDouble() * height.toDouble())

            val resultado = if( imc < 18.5 ){
                "Lean"
            }else if( imc in 18.5 .. 24.9 ){
                "Normal"
            }else if( imc in 25.0 .. 29.9 ){
                "Soreweight"
            }else{
                "Obese"
            }
            binding.txtDiagnosisResult.text = resultado

        }


        }


        

    }
