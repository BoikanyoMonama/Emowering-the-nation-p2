package com.example.xhawpoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)


                val chkFirstAid = findViewById<CheckBox>(R.id.chkFirstAid)
                val chkSewing = findViewById<CheckBox>(R.id.chkSewing)
                val chkLandscaping = findViewById<CheckBox>(R.id.chkLandscaping)
                val chkLifeSkills = findViewById<CheckBox>(R.id.chkLifeskills)
                val chkChildMinding = findViewById<CheckBox>(R.id.chkChildMinding)
                val chkCooking = findViewById<CheckBox>(R.id.chkCooking)
                val chkGardenMaintenance = findViewById<CheckBox>(R.id.chkGardenMaintenance)

                val edtName = findViewById<EditText>(R.id.edtName)
                val edtEmail = findViewById<EditText>(R.id.edtEmail)
                val edtPhone = findViewById<EditText>(R.id.edtPhone)
                val btnCalculate = findViewById<Button>(R.id.btnCalculate)
                val btnBack = findViewById<Button>(R.id.btnBackCalc)

                btnCalculate.setOnClickListener {
                    val selectedCourses = mutableListOf<String>()
                    var totalFee = 0.0

                    if (chkFirstAid.isChecked) { selectedCourses.add("First Aid"); totalFee += 1500 }
                    if (chkSewing.isChecked) { selectedCourses.add("Sewing"); totalFee += 1500 }
                    if (chkLandscaping.isChecked) { selectedCourses.add("Landscaping"); totalFee += 1500 }
                    if (chkLifeSkills.isChecked) { selectedCourses.add("Life Skills"); totalFee += 1500 }
                    if (chkChildMinding.isChecked) { selectedCourses.add("Child Minding"); totalFee += 750 }
                    if (chkCooking.isChecked) { selectedCourses.add("Cooking"); totalFee += 750 }
                    if (chkGardenMaintenance.isChecked) { selectedCourses.add("Garden Maintenance"); totalFee += 750 }

                    val count = selectedCourses.size
                    var discountPercent = 0.0
                    if (count == 2) discountPercent = 0.05
                    else if (count == 3) discountPercent = 0.10
                    else if (count > 3) discountPercent = 0.15

                    val discountAmount = totalFee * discountPercent
                    val subtotal = totalFee - discountAmount
                    val vat = subtotal * 0.15
                    val finalTotal = subtotal + vat

                    val i = Intent(this, InvoiceActivity::class.java)
                    i.putExtra("name", edtName.text.toString())
                    i.putExtra("email", edtEmail.text.toString())
                    i.putExtra("phone", edtPhone.text.toString())
                    i.putExtra("courses", selectedCourses.joinToString(", "))
                    i.putExtra("discountPercent", discountPercent * 100)
                    i.putExtra("finalTotal", finalTotal)
                    startActivity(i)
                }

                btnBack.setOnClickListener { finish() }
            }
        }
    }
}