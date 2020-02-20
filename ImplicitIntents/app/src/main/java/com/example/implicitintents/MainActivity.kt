package com.example.implicitintents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.core.app.ShareCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openWebsite(view: View) {
        val mWebsiteEditText = findViewById<EditText>(R.id.website_edittext)
        val url = mWebsiteEditText.text.toString()
        val webpage = Uri.parse(url)

        val intent = Intent(Intent.ACTION_VIEW, webpage)

        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }else{
            Log.d("ImplicitIntents", "Can't handle this!")
        }
    }
    fun openLocation(view: View) {
        val mLocationEditText = findViewById<EditText>(R.id.location_edittext)
        val loc = mLocationEditText.text.toString()
        val addressUri = Uri.parse("geo:0,0?q=$loc")

        val intent = Intent(Intent.ACTION_VIEW, addressUri)

        if (intent.resolveActivity(packageManager) != null){
            startActivity(intent)
        }else{
            Log.d("ImplicitIntents", "Can't handle this!")
        }
    }
    fun shareText(view: View) {
        val mShareTextEditText = findViewById<EditText>(R.id.share_edittext)
        val txt = mShareTextEditText.text.toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle(R.string.share_text_with)
            .setText(txt)
            .startChooser()

    }
}
