package com.example.plius_minus_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numChange:TextView = findViewById(R.id.changableNum)
        var plusButton:Button = findViewById(R.id.buttonPlus)
        var minusButton:Button = findViewById(R.id.buttonMinus)
        var result:TextView = findViewById(R.id.finalText)

        var count = 0

        plusButton.setOnClickListener {
            count++
            numChange.text = count.toString()
            if (count >= 10 ){
                numChange.text = "10"
                result.text = "ასწორებს ანდორიდი"
            }
        }
        minusButton.setOnClickListener {
            count--
            numChange.text = count.toString()
            if (count < 0 ){
                count = 0
                numChange.text = "0"
                println(numChange)
            }
        }
    }
}