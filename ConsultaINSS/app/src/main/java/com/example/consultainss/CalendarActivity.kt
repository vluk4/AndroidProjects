package com.example.consultainss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_calendar.*

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        setDateText()

    }

    fun setDateText(){
        val intent = intent
        val lastDigit = intent.getStringExtra("digit")
        val salary = intent.getStringExtra("choice")
        if(lastDigit == "0"){
            date_janeiro.text = "07/02/2020"
        }
    }
}
