package com.example.scorekeeper

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var mScore1 = 0
    var mScore2 = 0
    companion object{
        val STATE_SCORE_1 = "Team Score 1"
        val STATE_SCORE_2 = "Team Score 2"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mScore1 = 0
        mScore2 = 0

        if (savedInstanceState != null){
            mScore1 = savedInstanceState.getInt(STATE_SCORE_1)
            mScore2 = savedInstanceState.getInt(STATE_SCORE_2)

            score_1.text = mScore1.toString()
            score_2.text = mScore2.toString()
        }
    }

    fun decreaseScore(view: View) {
        val viewID = view.id
        if (viewID == R.id.decreaseTeam1) {
            mScore1--
            score_1.text = mScore1.toString()
        } else if (viewID == R.id.decreaseTeam2) {
            mScore2--
            score_2.text = mScore2.toString()
        }
    }

    fun increaseScore(view: View) {
        val viewID = view.id
        if (viewID == R.id.increaseTeam1) {
            mScore1++
            score_1.text = mScore1.toString()
        } else if (viewID == R.id.increaseTeam2) {
            mScore2++
            score_2.text = mScore2.toString()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        val nightMode = AppCompatDelegate.getDefaultNightMode()
        if(nightMode == AppCompatDelegate.MODE_NIGHT_YES){
            menu?.findItem(R.id.night_mode)?.setTitle(R.string.day_mode)
        } else{
            menu?.findItem(R.id.night_mode)?.setTitle(R.string.night_mode)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.night_mode) {
            val nightMode = AppCompatDelegate.getDefaultNightMode()

            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            recreate()
        }
        return true
    }

    override fun onSaveInstanceState(outState: Bundle) { // Save the scores.
        outState.putInt(STATE_SCORE_1, mScore1)
        outState.putInt(STATE_SCORE_2, mScore2)
        super.onSaveInstanceState(outState)
    }
}
