package com.example.consultainss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.ActionBar
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_calendar.*

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        setSupportActionBar(findViewById(R.id.my_toolbar_calendar))
        setDateText()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_share,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.menu_share_calendar -> {
            shareText()
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
    fun setDateText(){
        val intent = intent
        val lastDigit = intent.getStringExtra("digit")
        val salary = intent.getStringExtra("choice")
        //Dígito 0
        if(lastDigit == "0"){
            date_janeiro.text = getString(R.string.D0)
            date_fevereiro.text = getString(R.string.D0F)
            date_marco.text = getString(R.string.D0MA)
            date_abril.text = getString(R.string.D0A)
            date_maio.text = getString(R.string.D0MAIO)
            date_junho.text = getString(R.string.D0JUNHO)
            date_julho.text = getString(R.string.D0JULHO)
            date_agosto.text = getString(R.string.D0AGOSTO)
            date_setembro.text = getString(R.string.D0SETEMBRO)
            date_outubro.text = getString(R.string.D0OUTUBRO)
            date_novembro.text = getString(R.string.D0NOVEMBRO)
            date_dezembro.text = getString(R.string.D0DEZEMBRO)

        }
        //Dígito 1 até um salário mínimo
        else if(lastDigit == "1" && salary == "NÃO"){
            date_janeiro.text = getString(R.string.D1NJANEIRO)
            date_fevereiro.text = getString(R.string.D1NFEVEREIRO)
            date_marco.text = getString(R.string.D1NMARCO)
            date_abril.text = getString(R.string.D1NABRIL)
            date_maio.text = getString(R.string.D1NMAIO)
            date_junho.text = getString(R.string.D1NJUNHO)
            date_julho.text = getString(R.string.D1NJULHO)
            date_agosto.text = getString(R.string.D1NAGOSTO)
            date_setembro.text = getString(R.string.D1NSETEMBRO)
            date_outubro.text = getString(R.string.D1NOUTUBRO)
            date_novembro.text = getString(R.string.D1NNOVEMBRO)
            date_dezembro.text = getString(R.string.D1NDEZEMBRO)

        }
        //Dígito 1 mais de um salário mínimo
        else if(lastDigit == "1" && salary == "SIM"){
            date_janeiro.text = getString(R.string.D1SJANEIRO)
            date_fevereiro.text = getString(R.string.D1SFEVEREIRO)
            date_marco.text = getString(R.string.D1SMARCO)
            date_abril.text = getString(R.string.D1SABRIL)
            date_maio.text = getString(R.string.D1SMAIO)
            date_junho.text = getString(R.string.D1SJUNHO)
            date_julho.text = getString(R.string.D1SJULHO)
            date_agosto.text = getString(R.string.D1SAGOSTO)
            date_setembro.text = getString(R.string.D1SSETEMBRO)
            date_outubro.text = getString(R.string.D1SOUTUBRO)
            date_novembro.text = getString(R.string.D1SNOVEMBRO)
            date_dezembro.text = getString(R.string.D1SDEZEMBRO)
        }
        //Dígito 2 até um salário mínimo
        else if(lastDigit == "2" && salary == "NÃO"){
            date_janeiro.text = getString(R.string.D2NJANEIRO)
            date_fevereiro.text = getString(R.string.D2NFEVEREIRO)
            date_marco.text = getString(R.string.D2NMARCO)
            date_abril.text = getString(R.string.D2NABRIL)
            date_maio.text = getString(R.string.D2NMAIO)
            date_junho.text = getString(R.string.D2NJUNHO)
            date_julho.text = getString(R.string.D2NJULHO)
            date_agosto.text = getString(R.string.D2NAGOSTO)
            date_setembro.text = getString(R.string.D2NSETEMBRO)
            date_outubro.text = getString(R.string.D2NOUTUBRO)
            date_novembro.text = getString(R.string.D2NOVEMBRO)
            date_dezembro.text = getString(R.string.D2DEZEMBRO)
        }
        //Dígito 2 mais de um salário mínimo
        else if(lastDigit == "2" && salary == "SIM"){
            date_janeiro.text = getString(R.string.D2SJANEIRO)
            date_fevereiro.text = getString(R.string.D2SFEVEREIRO)
            date_marco.text = getString(R.string.D2SMARCO)
            date_abril.text = getString(R.string.D2SABRIL)
            date_maio.text = getString(R.string.D2SMAIO)
            date_junho.text = getString(R.string.D2SJUNHO)
            date_julho.text = getString(R.string.D2SJULHO)
            date_agosto.text = getString(R.string.D2SAGOSTO)
            date_setembro.text = getString(R.string.D2SSETEMBRO)
            date_outubro.text = getString(R.string.D2SOUTUBRO)
            date_novembro.text = getString(R.string.D2SNOVEMBRO)
            date_dezembro.text = getString(R.string.D2SDEZEMBRO)
        }
        //Dígito 3 até um salário mínimo
        else if(lastDigit == "3" && salary == "NÃO"){
            date_janeiro.text = getString(R.string.D3NJANEIRO)
            date_fevereiro.text = getString(R.string.D3NFEVEREIRO)
            date_marco.text = getString(R.string.D3NMARCO)
            date_abril.text = getString(R.string.D3NABRIL)
            date_maio.text = getString(R.string.D3NMAIO)
            date_junho.text = getString(R.string.D3NJUNHO)
            date_julho.text = getString(R.string.D3NJULHO)
            date_agosto.text = getString(R.string.D3NAGOSTO)
            date_setembro.text = getString(R.string.D3NSETEMBRO)
            date_outubro.text = getString(R.string.D3NOUTUBRO)
            date_novembro.text = getString(R.string.D3NOVEMBRO)
            date_dezembro.text = getString(R.string.D3DEZEMBRO)
        }
        //Dígito 3 mais de um salário mínimo
        else if(lastDigit == "3" && salary == "SIM"){
            date_janeiro.text = getString(R.string.D3SJANEIRO)
            date_fevereiro.text = getString(R.string.D3SFEVEREIRO)
            date_marco.text = getString(R.string.D3SMARCO)
            date_abril.text = getString(R.string.D3SABRIL)
            date_maio.text = getString(R.string.D3SMAIO)
            date_junho.text = getString(R.string.D3SJUNHO)
            date_julho.text = getString(R.string.D3SJULHO)
            date_agosto.text = getString(R.string.D3SAGOSTO)
            date_setembro.text = getString(R.string.D3SSETEMBRO)
            date_outubro.text = getString(R.string.D3SOUTUBRO)
            date_novembro.text = getString(R.string.D3SNOVEMBRO)
            date_dezembro.text = getString(R.string.D3SDEZEMBRO)
        }
        //Dígito 4 até um salário mínimo
        else if(lastDigit == "4" && salary == "NÃO"){
            date_janeiro.text = getString(R.string.D4NJANEIRO)
            date_fevereiro.text = getString(R.string.D4NFEVEREIRO)
            date_marco.text = getString(R.string.D4NMARCO)
            date_abril.text = getString(R.string.D4NABRIL)
            date_maio.text = getString(R.string.D4NMAIO)
            date_junho.text = getString(R.string.D4NJUNHO)
            date_julho.text = getString(R.string.D4NJULHO)
            date_agosto.text = getString(R.string.D4NAGOSTO)
            date_setembro.text = getString(R.string.D4NSETEMBRO)
            date_outubro.text = getString(R.string.D4NOUTUBRO)
            date_novembro.text = getString(R.string.D4NOVEMBRO)
            date_dezembro.text = getString(R.string.D4DEZEMBRO)
        }
        //Dígito 4 mais de um salário mínimo
        else if(lastDigit == "4" && salary == "SIM"){
            date_janeiro.text = getString(R.string.D4SJANEIRO)
            date_fevereiro.text = getString(R.string.D4SFEVEREIRO)
            date_marco.text = getString(R.string.D4SMARCO)
            date_abril.text = getString(R.string.D4SABRIL)
            date_maio.text = getString(R.string.D4SMAIO)
            date_junho.text = getString(R.string.D4SJUNHO)
            date_julho.text = getString(R.string.D4SJULHO)
            date_agosto.text = getString(R.string.D4SAGOSTO)
            date_setembro.text = getString(R.string.D4SSETEMBRO)
            date_outubro.text = getString(R.string.D4SOUTUBRO)
            date_novembro.text = getString(R.string.D4SNOVEMBRO)
            date_dezembro.text = getString(R.string.D4SDEZEMBRO)
        }

        //Dígito 5 até um salário mínimo
        else if(lastDigit == "5" && salary == "NÃO"){
            date_janeiro.text = getString(R.string.D5NJANEIRO)
            date_fevereiro.text = getString(R.string.D5NFEVEREIRO)
            date_marco.text = getString(R.string.D5NMARCO)
            date_abril.text = getString(R.string.D5NABRIL)
            date_maio.text = getString(R.string.D5NMAIO)
            date_junho.text = getString(R.string.D5NJUNHO)
            date_julho.text = getString(R.string.D5NJULHO)
            date_agosto.text = getString(R.string.D5NAGOSTO)
            date_setembro.text = getString(R.string.D5NSETEMBRO)
            date_outubro.text = getString(R.string.D5NOUTUBRO)
            date_novembro.text = getString(R.string.D5NOVEMBRO)
            date_dezembro.text = getString(R.string.D5DEZEMBRO)
        }
        //Dígito 5 mais de um salário mínimo
        else if(lastDigit == "5" && salary == "SIM"){
            date_janeiro.text = getString(R.string.D5SJANEIRO)
            date_fevereiro.text = getString(R.string.D5SFEVEREIRO)
            date_marco.text = getString(R.string.D5SMARCO)
            date_abril.text = getString(R.string.D5SABRIL)
            date_maio.text = getString(R.string.D5SMAIO)
            date_junho.text = getString(R.string.D5SJUNHO)
            date_julho.text = getString(R.string.D5SJULHO)
            date_agosto.text = getString(R.string.D5SAGOSTO)
            date_setembro.text = getString(R.string.D5SSETEMBRO)
            date_outubro.text = getString(R.string.D5SOUTUBRO)
            date_novembro.text = getString(R.string.D5SNOVEMBRO)
            date_dezembro.text = getString(R.string.D5SDEZEMBRO)
        }
        //Dígito 6
        else if(lastDigit == "6"){
            date_janeiro.text = getString(R.string.D6JANEIRO)
            date_fevereiro.text = getString(R.string.D6FEVEREIRO)
            date_marco.text = getString(R.string.D6MARCO)
            date_abril.text = getString(R.string.D6ABRIL)
            date_maio.text = getString(R.string.D6MAIO)
            date_junho.text = getString(R.string.D6JUNHO)
            date_julho.text = getString(R.string.D6JULHO)
            date_agosto.text = getString(R.string.D6AGOSTO)
            date_setembro.text = getString(R.string.D6SETEMBRO)
            date_outubro.text = getString(R.string.D6OUTUBRO)
            date_novembro.text = getString(R.string.D6NOVEMBRO)
            date_dezembro.text = getString(R.string.D6DEZEMBRO)
        }
        //Dígito 7
        else if(lastDigit == "7"){
            date_janeiro.text = getString(R.string.D7JANEIRO)
            date_fevereiro.text = getString(R.string.D7FEVEREIRO)
            date_marco.text = getString(R.string.D7MARCO)
            date_abril.text = getString(R.string.D7ABRIL)
            date_maio.text = getString(R.string.D7MAIO)
            date_junho.text = getString(R.string.D7JUNHO)
            date_julho.text = getString(R.string.D7JULHO)
            date_agosto.text = getString(R.string.D7AGOSTO)
            date_setembro.text = getString(R.string.D7SETEMBRO)
            date_outubro.text = getString(R.string.D7OUTUBRO)
            date_novembro.text = getString(R.string.D7NOVEMBRO)
            date_dezembro.text = getString(R.string.D7DEZEMBRO)
        }
        //Dígito 8
        else if(lastDigit == "8"){
            date_janeiro.text = getString(R.string.D8JANEIRO)
            date_fevereiro.text = getString(R.string.D8FEVEREIRO)
            date_marco.text = getString(R.string.D8MARCO)
            date_abril.text = getString(R.string.D8ABRIL)
            date_maio.text = getString(R.string.D8MAIO)
            date_junho.text = getString(R.string.D8JUNHO)
            date_julho.text = getString(R.string.D8JULHO)
            date_agosto.text = getString(R.string.D8AGOSTO)
            date_setembro.text = getString(R.string.D8SETEMBRO)
            date_outubro.text = getString(R.string.D8OUTUBRO)
            date_novembro.text = getString(R.string.D8NOVEMBRO)
            date_dezembro.text = getString(R.string.D8DEZEMBRO)
        }
        //Dígito 9
        else if(lastDigit == "9"){
            date_janeiro.text = getString(R.string.D9JANEIRO)
            date_fevereiro.text = getString(R.string.D9FEVEREIRO)
            date_marco.text = getString(R.string.D9MARCO)
            date_abril.text = getString(R.string.D9ABRIL)
            date_maio.text = getString(R.string.D9MAIO)
            date_junho.text = getString(R.string.D9JUNHO)
            date_julho.text = getString(R.string.D9JULHO)
            date_agosto.text = getString(R.string.D9AGOSTO)
            date_setembro.text = getString(R.string.D9SETEMBRO)
            date_outubro.text = getString(R.string.D9OUTUBRO)
            date_novembro.text = getString(R.string.D9NOVEMBRO)
            date_dezembro.text = getString(R.string.D9DEZEMBRO)
        }
    }

    fun shareText() {
        val txt = "http://www.google.com.br"
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle(R.string.share_text_with)
            .setText(txt)
            .startChooser()
    }
}
