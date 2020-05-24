package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById(R.id.txt1) as EditText
        val pass = findViewById(R.id.txt2) as EditText

        val loginClick = findViewById(R.id.btnLogin) as Button
        loginClick.setOnClickListener() {

            val ema: String = email.text.toString()
            val pwd: String = pass.text.toString()

        //i did some changes below for working function properly

            if (ema.isEmpty() && pwd.isEmpty()) {
                Toast.makeText(
                    applicationContext, "fields are cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }

            else if (ema.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext, "Email field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if (pwd.trim().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Password field cannot be empty",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else if (!(ema != "abc@xyz.com" || pwd != "123456")) {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)

            }
            else {
                Toast.makeText(
                    applicationContext, "Wrong Email or Password!!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }
}

