package com.apkrozi.responsi288

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_priview.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.view.*

class Priview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priview)

        var intent = intent
        val nama = intent.getStringExtra("Nama")
        var password = intent.getStringExtra("Password")
        val email = intent.getStringExtra("Email")
        val alamat = intent.getStringExtra("Alamat")
        val handphone = intent.getStringExtra("No.Hp")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM : "+nama+"\nNama: "+email+"\nNilai: "+password+"\nAlamat : "+alamat+"\nNo.Hp :"+handphone

        pindahlogin.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}