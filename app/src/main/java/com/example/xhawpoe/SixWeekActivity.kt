package com.example.xhawpoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SixWeekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_six_week)


                findViewById<Button>(R.id.btnChildMinding).setOnClickListener {
                    intent(this, DetailsActivity::class.java)
                }
                findViewById<Button>(R.id.btnCooking).setOnClickListener {
                    intent(this, DetailsActivity::class.java)
                }
                findViewById<Button>(R.id.btnGardenMaintenance).setOnClickListener {
                    intent(this, DetailsActivity::class.java)
                }

                findViewById<Button>(R.id.btnBack2).setOnClickListener { finish() }


            private fun openDetail(name: String, fee: Double, duration: String, purpose: String) {
                val i = Intent(this, DetailsActivity::class.java)
                i.putExtra("courseName", name)
                i.putExtra("fee", fee)
                i.putExtra("duration", duration)
                i.putExtra("purpose", purpose)
                startActivity(i) }
    }
}
