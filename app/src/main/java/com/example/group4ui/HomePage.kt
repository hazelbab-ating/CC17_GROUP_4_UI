package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {

    private var isSoundOn = true
    private lateinit var soundButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page) // This is where you use the XML name

        // Initialize sound button
        soundButton = findViewById(R.id.sndBtn) // Replace with your actual sound button ID

        // Set up sound button click listener
        soundButton.setOnClickListener {
            toggleSound()
        }

        findViewById<ImageButton>(R.id.playBtn).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.dictBtn).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.rewardsBtn).setOnClickListener {
            val intent = Intent(this, Rewards::class.java)
            startActivity(intent)
        }
    }
    private fun toggleSound() {
        isSoundOn = !isSoundOn

        if (isSoundOn) {
            soundButton.setImageResource(R.drawable.soundbutton)
            // Enable sound logic here
            enableSound()
        } else {
            soundButton.setImageResource(R.drawable.property_1_sound_off)
            // Disable sound logic here
            disableSound()
        }
    }
    private fun enableSound() {
        // Add your sound enabling logic here
        // For example: save sound preference, resume background music, etc.
    }

    private fun disableSound() {
        // Add your sound disabling logic here
        // For example: save sound preference, pause background music, etc.
    }
}

