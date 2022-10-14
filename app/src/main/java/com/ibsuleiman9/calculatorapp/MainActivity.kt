package com.ibsuleiman9.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.ibsuleiman9.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn0.setOnClickListener {
            onDigitClicked(binding.btn0)
        }
        binding.btn1.setOnClickListener {
            onDigitClicked(binding.btn1)
        }
        binding.btn2.setOnClickListener {
            onDigitClicked(binding.btn2)
        }
        binding.btn3.setOnClickListener {
            onDigitClicked(binding.btn3)
        }
        binding.btn4.setOnClickListener {
            onDigitClicked(binding.btn4)
        }
        binding.btn5.setOnClickListener {
            onDigitClicked(binding.btn5)
        }
        binding.btn6.setOnClickListener {
            onDigitClicked(binding.btn6)
        }
        binding.btn7.setOnClickListener {
            onDigitClicked(binding.btn7)
        }
        binding.btn8.setOnClickListener {
            onDigitClicked(binding.btn8)
        }
        binding.btn9.setOnClickListener {
            onDigitClicked(binding.btn9)
        }
        binding.btnCLR.setOnClickListener {
            onClearClicked(binding.btnCLR)
        }
        binding.btnDot.setOnClickListener {
            onDigitClicked(binding.btnDot)
        }
    }

    private fun onClearClicked(btnCLR: Button) {
        binding.tvResult?.text = ""
    }

    private fun onDigitClicked(view: View) {
        binding.tvResult?.append((view as Button).text)
    }
}