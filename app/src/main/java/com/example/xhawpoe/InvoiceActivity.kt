package com.example.xhawpoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InvoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_invoice)


                val name = intent.getStringExtra("name")
                val email = intent.getStringExtra("email")
                val phone = intent.getStringExtra("phone")
                val courses = intent.getStringExtra("courses")
                val discountPercent = intent.getDoubleExtra("discountPercent", 0.0)
                val finalTotal = intent.getDoubleExtra("finalTotal", 0.0)

                findViewById<TextView>(R.id.txtInvoiceTitle).text = "Quotation Summary"
                findViewById<TextView>(R.id.txtCustomer).text = "Customer: $name\nEmail: $email\nPhone: $phone"
                findViewById<TextView>(R.id.txtCourses).text = "Courses: $courses"
                findViewById<TextView>(R.id.txtDiscount).text = "Discount Applied: $discountPercent%"
                findViewById<TextView>(R.id.txtTotal).text = "Total (incl. VAT): R%.2f".format(finalTotal)

                findViewById<Button>(R.id.btnBackInvoice).setOnClickListener { finish() }
            }
        }

