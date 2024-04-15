package com.example.myapplication

import android.os.Bundle
import kotlin.android.synthetic.main.activity_main.*
import java.util.Calendar
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btGetage.setOnClickListener {
            userAgeClick()
        }

        fun userAgeClick() {
            val userDOB = Intger.parseInt(etDoB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAgeInYears = currentYear - userDOB
            txShowage.text = "Your age is $userAgeInYears years"
        }

        }
    }
