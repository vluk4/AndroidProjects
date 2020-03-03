package com.example.a52semanasobjetivo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.card_objetivo_manual.*
import kotlinx.android.synthetic.main.card_objetivo_manual.view.*
import kotlinx.android.synthetic.main.card_objetivo_manual.view.card_manual
import kotlinx.android.synthetic.main.fragment_proximo_objetivo.*
import kotlinx.android.synthetic.main.fragment_vamos_la.*
import kotlinx.android.synthetic.main.fragment_vamos_la.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vamosLa = VamosLa.newInstance()
        openFragment(vamosLa)

    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            addToBackStack(null)
        }
        transaction.commit()
    }
}
