package com.example.a52semanasobjetivo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.card_objetivo_manual.*

/**
 * A simple [Fragment] subclass.
 */
class ProximoObjetivo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_proximo_objetivo, container, false)

    }

    companion object{
        fun newInstance(): ProximoObjetivo{
            return ProximoObjetivo()
        }
    }


}
