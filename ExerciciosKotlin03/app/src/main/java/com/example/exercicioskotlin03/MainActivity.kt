package com.example.exercicioskotlin03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun validarCampos(view: View) {
        if (edNome.text.length <= 3){
            tvNome.visibility = View.VISIBLE
        }else{
            tvNome.visibility = View.INVISIBLE
        }
        if (edIdade.text.toString().toInt() < 0 || edIdade.text.toString().toInt() > 150){
            tvIdade.visibility = View.VISIBLE
        }else{
            tvIdade.visibility = View.INVISIBLE
        }
        if (edSalario.text.toString().toInt() <= 0){
            tvSalario.visibility = View.VISIBLE
        }else{
            tvSalario.visibility = View.INVISIBLE
        }
        if (edSexo.text.toString() == "f" || edSexo.text.toString() == "m"){
            tvSexo.visibility = View.INVISIBLE
            Log.e("sexo", edSexo.text.toString())
        }else{
            tvSexo.visibility = View.VISIBLE
        }
        if(edEstadoCivil.text.toString() == "s" || edEstadoCivil.text.toString() == "c" || edEstadoCivil.text.toString() == "v" || edEstadoCivil.text.toString() == "d"){
            tvEstadoCivil.visibility = View.INVISIBLE
            Log.e("estado", edEstadoCivil.text.toString())
        }else{
            tvEstadoCivil.visibility = View.VISIBLE
        }
    }
}
