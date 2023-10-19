package com.example.project_mangement_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val getStartedButton = findViewById<View>(R.id.getStartedButton)

        getStartedButton.setOnClickListener {
            val intent = Intent(this, EmployeesList::class.java)
            startActivity(intent)
        }
    }}
