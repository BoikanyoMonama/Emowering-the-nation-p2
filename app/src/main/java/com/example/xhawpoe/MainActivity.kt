package com.example.xhawpoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

                val btnSixMonth = findViewById<Button>(R.id.btnSixMonth)
                val btnSixWeek = findViewById<Button>(R.id.btnSixWeek)
                val btnCalculator = findViewById<Button>(R.id.btnCalculator)
                val btnContact = findViewById<Button>(R.id.btnContact)

                btnSixMonth.setOnClickListener {
                    val intent = Intent(this, SixMonthActivity::class.java)
                    startActivity(intent)
                }

                btnSixWeek.setOnClickListener {
                    val intent = Intent(this, SixWeekActivity::class.java)
                    startActivity(intent)
                }

                btnCalculator.setOnClickListener {
                    val intent = Intent(this, CalculatorActivity::class.java)
                    startActivity(intent)
                }

                btnContact.setOnClickListener {
                    val intent = Intent(this, ContactActivity::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}