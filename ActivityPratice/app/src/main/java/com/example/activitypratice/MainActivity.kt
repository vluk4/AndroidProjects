package com.example.activitypratice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE: String = "com.example.android.activitypratice.extra.MESSAGE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchSecondActivity(view: View, choice: Int){
        val intent = Intent(this, SecondActivity::class.java)
        if (choice == 1){
            //TODO
        }
        startActivity(intent)
    }
}
