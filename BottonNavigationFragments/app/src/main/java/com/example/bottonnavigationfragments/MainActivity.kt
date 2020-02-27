package com.example.bottonnavigationfragments

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_view.setOnNavigationItemSelectedListener(this)

        val firstFragment = FragmentGoals.newinstance()
        openFragment(firstFragment)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item_objetivos -> {
                val firstFragment = FragmentGoals.newinstance()
                openFragment(firstFragment)
            }
            R.id.item_sobre -> {
                val secondFragment = FragmentAbout.newinstance()
                openFragment(secondFragment)
            }
            else -> {
            }
        }
        return true
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun openWebsite(view: View) {
        val url = "https://blog.mobills.com.br/desafio-52-semanas-para-poupar-dinheiro/"
        val webpage = Uri.parse(url)

        val intent = Intent(Intent.ACTION_VIEW, webpage)

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this!");
        }
    }
}
