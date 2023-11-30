package com.example.notes_sqlite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.notes_sqlite.databinding.ActivityLoginBinding
import com.example.notes_sqlite.databinding.ActivityMainBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val welcomebtn = findViewById<FloatingActionButton>(R.id.welcomeButton)
        welcomebtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}
