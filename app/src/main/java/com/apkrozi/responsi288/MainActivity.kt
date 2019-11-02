package com.apkrozi.responsi288


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbtn.setOnClickListener {
            val email = user.text.toString()
            val password = pass.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "rozi17@gmail.com" || password == "rozi17") {
                val intent = Intent(this, Dashboard::class.java)
                startActivity(intent)
            }
        }

        create.setOnClickListener{
            val intent = Intent (this, Register::class.java)
            startActivity(intent)
        }
    }
}