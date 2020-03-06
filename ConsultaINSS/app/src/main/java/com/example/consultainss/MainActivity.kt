package com.example.consultainss

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.last_card_digit_dialog.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        select_digit.radio_group1.clearCheck()
        select_digit.radio_group2.clearCheck()
        select_digit.radio_group1.setOnCheckedChangeListener(listener1)
        select_digit.radio_group2.setOnCheckedChangeListener(listener2)

    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton){
            val checked = view.isChecked

            when(view.getId()){
                R.id.rbSim ->{
                    if (checked){
                        rbSim.setTextColor(Color.WHITE)
                        rbNao.setTextColor(resources.getColor(R.color.ColorGreen))
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

    private val listener1: RadioGroup.OnCheckedChangeListener =
        RadioGroup.OnCheckedChangeListener { _, checkedId ->
            if (checkedId != -1) {
                select_digit.radio_group2.setOnCheckedChangeListener(null)
                select_digit.radio_group2.clearCheck()
                select_digit.radio_group2.setOnCheckedChangeListener(listener2)
            }
        }

    private val listener2: RadioGroup.OnCheckedChangeListener =
        RadioGroup.OnCheckedChangeListener { _, checkedId ->
            if (checkedId != -1) {
                select_digit.radio_group1.setOnCheckedChangeListener(null)
                select_digit.radio_group1.clearCheck()
                select_digit.radio_group1.setOnCheckedChangeListener(listener1)
            }
        }

    fun showDialog(view: View) {
        val newFragment = CardInformationDialogFragment()
        newFragment.show(supportFragmentManager,"card_info")
    }

    fun launchCalendarActivity(view: View) {
        val intent = Intent(this, CalendarActivity::class.java)
        val chkId0 = radioGroup.checkedRadioButtonId
        val chkId1 = select_digit.radio_group1.checkedRadioButtonId
        val chkId2 = select_digit.radio_group2.checkedRadioButtonId
        val realCheck = if (chkId1 == -1) chkId2 else chkId1

        val checkedButtonSalary = findViewById<RadioButton>(chkId0)
        val choice = checkedButtonSalary.text.toString()
        if (realCheck == -1){
            tvError.visibility = View.VISIBLE
        }else{
            tvError.visibility = View.INVISIBLE
            val checkedButtonDigit = findViewById<RadioButton>(realCheck)
            val digit = checkedButtonDigit.text.toString()

            intent.putExtra("digit", digit)
            intent.putExtra("choice", choice)
            startActivity(intent)
        }
    }
}
