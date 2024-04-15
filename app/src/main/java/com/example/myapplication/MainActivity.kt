package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etDoB: EditText = findViewById(R.id.etDoB)
        val btGetAge: Button = findViewById(R.id.btGetAge)
        val txShowAge: TextView = findViewById(R.id.txShowAge)

        btGetAge.setOnClickListener {
            val userDOB = etDoB.text.toString().toIntOrNull()
            if (userDOB != null) {
                val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                val userAgeInYears = currentYear - userDOB
                txShowAge.text = "Your age is $userAgeInYears years"
                Log.d("Log Me", "Your age is $userAgeInYears years")
            } else {
                txShowAge.text = "Please enter a valid year"
            }
        }
    }
}
