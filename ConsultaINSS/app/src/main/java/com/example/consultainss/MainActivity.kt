package com.example.consultainss

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.widget.AppCompatRadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton){
            val checked = view.isChecked

            when(view.getId()){
                R.id.rbSim ->{
                    if (checked){
                        rbSim.setTextColor(Color.WHITE)
                        rbNao.setTextColor(Color.GREEN)
                    }
                }
                R.id.rbNao ->{
                    if (checked){
                        rbSim.setTextColor(Color.RED)
                        rbNao.setTextColor(Color.WHITE)
                    }
                }
            }
        }
    }
}
