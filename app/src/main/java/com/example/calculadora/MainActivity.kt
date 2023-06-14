package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValue1 = findViewById<EditText>(R.id.first_value)
        val edtValue2 = findViewById<EditText>(R.id.second_value)
        val ViewResult = findViewById<TextView>(R.id.result)
        val btnSoma = findViewById<Button>(R.id.sum)
        val btnSub = findViewById<Button>(R.id.subtraction)
        val btnDiv = findViewById<Button>(R.id.division)
        val btnMult = findViewById<Button>(R.id.multiplication)

        btnSoma.setOnClickListener {
            val n1: Double
            val n2: Double
            val res: Double

            n1 = edtValue1.text.toString().toDouble()
            n2 = edtValue2.text.toString().toDouble()
            res = (n1 + n2)
            ViewResult.setText(res.toString())
        }
        btnSub.setOnClickListener {
            val n1: Double
            val n2: Double
            val res: Double

            n1 = edtValue1.text.toString().toDouble()
            n2 = edtValue2.text.toString().toDouble()
            res = (n1 - n2)
            ViewResult.setText(res.toString())
        }
        btnDiv.setOnClickListener {
            val n1: Double
            val n2: Double
            var res: Double

            n1 = edtValue1.text.toString().toDouble()
            n2 = edtValue2.text.toString().toDouble()
            res = (n1 / n2)

            if (n1 == 0.0 || n2 == 0.0) {
                res = 0.0
                val alert = "Não é possível dividir por zero"
                Toast.makeText(this, alert, Toast.LENGTH_LONG).show()
            }

            ViewResult.setText(res.toString())

        }
        btnMult.setOnClickListener {
            val n1: Double
            val n2: Double
            val res: Double

            n1 = edtValue1.text.toString().toDouble()
            n2 = edtValue2.text.toString().toDouble()
            res = (n1 * n2)
            ViewResult.setText(res.toString())
        }
    }
}