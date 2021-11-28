package com.example.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var truemail = ""
    private var truepass = ""

    private lateinit var email1: EditText
    private lateinit var password1: EditText
    private lateinit var login1: Button
    private lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email1 = findViewById(R.id.email1)
        password1 = findViewById(R.id.password1)
        login1 = findViewById(R.id.login1)
        signup = findViewById(R.id.signup)

        login1.setOnClickListener{
            if (email1.text.toString() == truemail && password1.text.toString() == truepass){
                Toast.makeText(this,"Correct info",Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this,"Wrong info",Toast.LENGTH_SHORT).show()
        }

        signup.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}