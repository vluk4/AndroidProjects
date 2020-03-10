package com.example.exercicioskotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularSalario(view: View) {
        val salario: String = edSalario.text.toString()
        val valor: Double = salario.toDouble()

        var porcentagem: Double = 0.0
        if (valor < 280){
            porcentagem = 0.2
        }else if (valor > 280 && valor <= 700){
            porcentagem = 0.15
        }else if (valor > 700 && valor <= 1500){
            porcentagem = 0.1
        }else if (valor > 1500){
            porcentagem = 0.05
        }

        tvSalarioAntes.text = "Salário : R$ $salario"
        tvPercentual.text = "Percentual de aumento : ${(100*porcentagem).toString()}%"
        tvValorAumento.text = "Valor do aumento : R$ ${(valor * porcentagem).toString()}"
        tvSalarioDepois.text = "Novo salário : R$ ${(valor * (1+porcentagem)).toString()}"
    }
}
