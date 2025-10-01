package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Rewards: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rewards) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn4).setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        val goButtons = listOf(
            R.id.go1, R.id.go2, R.id.go3
        )

        // Assign same listener to all
        for (id in goButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, MiniGames::class.java)
                startActivity(intent)
            }
        }
    }
}