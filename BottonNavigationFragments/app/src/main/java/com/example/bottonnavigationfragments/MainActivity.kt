package com.example.bottonnavigationfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_nav_view.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.first_fragment_button->{
                supportActionBar!!.title = "Primeiro Fragmento"
                val firstFragment = FirstFragment.newinstance()
                openFragment(firstFragment)
            }
            R.id.second_fragment_button->{
                supportActionBar!!.title = "Segundo Fragmento"
                val secondFragment = SecondFragment.newinstance()
                openFragment(secondFragment)
            }
            R.id.third_fragment_button->{
                supportActionBar!!.title = "Terceiro Fragmento"
                val thirdFragment = ThirdFragment.newintance()
                openFragment(thirdFragment)
            }
            else->{
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
}
