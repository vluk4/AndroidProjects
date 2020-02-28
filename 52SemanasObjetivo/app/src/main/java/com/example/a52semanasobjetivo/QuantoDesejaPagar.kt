package com.example.a52semanasobjetivo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class QuantoDesejaPagar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quanto_deseja_pagar, container, false)
    }

    companion object{
        fun newInstance(): QuantoDesejaPagar{
            return QuantoDesejaPagar()
        }
    }
}
