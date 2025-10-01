package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView

class MiniGames: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mini_games) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn).setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.strawberryBtn).setOnClickListener {
            val intent = Intent(this, Strawberry::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.weaveBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.starBtn).setOnClickListener {
            val intent = Intent(this, Rewards::class.java)
            startActivity(intent)
        }
    }
}