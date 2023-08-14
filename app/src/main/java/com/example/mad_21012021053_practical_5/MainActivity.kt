package com.example.mad_21012021053_practical_5

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val brsbtn:Button = findViewById(R.id.Browsebtn)
        val browsedit =findViewById<EditText>(R.id.swebbrw)
        brsbtn.setOnClickListener {
            searchurl(browsedit.text.toString())
        }

    }
    fun searchurl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }

    }
    fun phonenumber(number:String){

    }
    fun logdetail() {

    }
    fun gallary() {

    }
    fun camera() {

    }
    fun alram() {

    }
}

