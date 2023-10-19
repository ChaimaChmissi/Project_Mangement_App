package com.example.project_mangement_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class GetStarted_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_started_2)

        val getStartedButton = findViewById<View>(R.id.getStartedButton)

        getStartedButton.setOnClickListener {
            val intent = Intent(this, GetStarted_3::class.java)
            startActivity(intent)
        }
    }
}