package com.example.temperatureconverter


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num1 = findViewById<EditText>(R.id.getVal)
        val b1 = findViewById<Button>(R.id.ShowAnswer)
        val b2 = findViewById<Button>(R.id.button2)
        val ans1 = findViewById<TextView>(R.id.ShowAns)
        val ans2 = findViewById<TextView>(R.id.showAns2)


        b1.setOnClickListener {
            val c = num1.text.toString().toFloat()
            val f = (c * 9/5)+32
            ans1.text= f.toString()

            val c2 = num1.text.toString().toInt()
            val k = c2 + 273.15
            ans2.text = k.toString()

        }

        // Refresh button
        b2.setOnClickListener {
            num1.setText("")
            ans1.text = ("")
            ans2.text = ("")
        }
    }
}

