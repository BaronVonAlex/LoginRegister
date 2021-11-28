package com.example.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.content.Intent

class MainActivity2 : AppCompatActivity(){
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var firstname: EditText
    private lateinit var lastname: EditText
    private lateinit var username: EditText
    private lateinit var register: Button
    private lateinit var register2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        firstname = findViewById(R.id.firstname)
        lastname = findViewById(R.id.lastname)
        username = findViewById(R.id.username)
        register = findViewById(R.id.register)
        register2 = findViewById(R.id.register2)


        register.setOnClickListener {
            val mail = email.text.toString()
            val password2 = password.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("email",mail)
            intent.putExtra("password3",password2)
            intent.putExtra("firstname","firstname1")
            intent.putExtra("lastname","lastname1")
            intent.putExtra("username","username1")
            startActivity(intent)
        }

        register2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}