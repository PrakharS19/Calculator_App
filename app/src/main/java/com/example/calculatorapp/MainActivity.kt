package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPlus = findViewById<Button>(R.id.btnPlus)
        val EtInput1 = findViewById<TextInputEditText>(R.id.EtInput1)
        val EtInput2 = findViewById<TextInputEditText>(R.id.EtInput2)
        val TvResult = findViewById<TextView>(R.id.TvResult)
        btnPlus.setOnClickListener {
            val input1 = EtInput1.text.toString().toInt()
            val input2 = EtInput2.text.toString().toInt()

            TvResult.text = (input1 + input2).toString()
        }
        val btnMinus=findViewById<Button>(R.id.btnMinus)
        btnMinus.setOnClickListener {
            val input1 = EtInput1.text.toString().toInt()
            val input2 = EtInput2.text.toString().toInt()

            TvResult.text = (input1 - input2).toString()
        }
        val btnDiv=findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {
            val input1 = EtInput1.text.toString().toInt()
            val input2 = EtInput2.text.toString().toInt()

            TvResult.text = (input1/input2).toString()
    }
        val btnMul=findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener {
            val input1 = EtInput1.text.toString().toInt()
            val input2 = EtInput2.text.toString().toInt()

            TvResult.text = (input1*input2).toString()
        }
    }
}
