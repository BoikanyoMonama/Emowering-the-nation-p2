package com.example.xhawpoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_details)


                val name = intent.getStringExtra("courseName")
                val fee = intent.getDoubleExtra("fee", 0.0)
                val duration = intent.getStringExtra("duration")
                val purpose = intent.getStringExtra("purpose")

                findViewById<TextView>(R.id.txtCourseName).text = name
                findViewById<TextView>(R.id.txtCourseFee).text = "Fee: R$fee"
                findViewById<TextView>(R.id.txtCourseDuration).text = "Duration: $duration"
                findViewById<TextView>(R.id.txtPurpose).text = purpose

                findViewById<Button>(R.id.btnBackDetail).setOnClickListener { Intent(this, CalculatorActivity::class.java) }
            }
        }

