package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val EXTRA_MESSAGE: String = "com.example.android.twoactivities.extra.MESSAGE"
    val LOG_TAG: String = "MainActivity"

    companion object{
        val EXTRA_MESSAGE: String = "com.example.android.twoactivities.extra.MESSAGE"
        val TEXT_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Button Clicked!")

        val intent = Intent(this, SecondActivity::class.java)
        val mMessageEditText = findViewById<EditText>(R.id.editText_main)
        val message = mMessageEditText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val mReplyTextView = findViewById<TextView>(R.id.text_message_reply)
        val mMessageEditText = findViewById<EditText>(R.id.editText_main)
        val mReplyHeadTextView = findViewById<TextView>(R.id.text_message_reply)

        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                val reply = data?.getStringExtra(SecondActivity.EXTRA_REPLY)
                mReplyHeadTextView.visibility = View.VISIBLE
                mReplyTextView.text = reply
                mReplyTextView.visibility = View.VISIBLE
            }
        }
    }
}
