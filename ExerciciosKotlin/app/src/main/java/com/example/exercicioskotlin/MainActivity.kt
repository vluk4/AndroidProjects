package com.example.exercicioskotlin

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
        val ganhoPorHora: String = edGanhoPorHora.text.toString()
        val ganho: Double = ganhoPorHora.toDouble()
        val horasTrabalhadas: String = edNumeroDeHoras.text.toString()
        val horas: Double = horasTrabalhadas.toDouble()

        val salarioBruto = ganho*horas
        val impostoDeRenda = salarioBruto * 0.11
        val inss = salarioBruto * 0.08
        val sindicato = salarioBruto * 0.05
        val salarioLiquido = salarioBruto - (impostoDeRenda+inss+sindicato)

        tvSalarioBruto.text = "Salário bruto : R$ ${salarioBruto.toString()}"
        tvIR.text = "IR (11%) : R$ ${impostoDeRenda.toString()}"
        tvINSS.text = "INSS (8%) : R$ ${inss.toString()}"
        tvSindicato.text = "Sindicato (5%) : R$ ${sindicato.toString()}"
        tvSalarioLiquido.text = "Salário Líquido : R$ ${salarioLiquido.toString()}"
    }
}
