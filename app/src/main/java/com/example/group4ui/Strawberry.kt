package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Strawberry: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.strawberry1) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn1).setOnClickListener {
            val intent = Intent(this, Strawberry2::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.basket).setOnClickListener {
            val intent = Intent(this, Strawberry3::class.java)
            startActivity(intent)
        }
    }
}

class Strawberry2: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.strawberry2) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn1).setOnClickListener {
            val Intent = Intent(this, MiniGames::class.java)
            startActivity(Intent)
        }

        findViewById<ImageButton>(R.id.noBtn1).setOnClickListener {
            val Intent = Intent(this, Strawberry::class.java)
            startActivity(Intent)
        }
    }
}

class Strawberry3: AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.strawberry3) // This is where you use the XML name

        findViewById<ImageButton>(R.id.tryBtn).setOnClickListener {
            val intent = Intent(this, Strawberry::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.anotherBtn).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }
    }
}
