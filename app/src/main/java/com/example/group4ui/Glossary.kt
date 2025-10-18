package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Glossary: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.glossary) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn1).setOnClickListener {
            val intent = Intent(this, Glossary1::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn2).setOnClickListener {
            val intent = Intent(this, Glossary2::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn3).setOnClickListener {
            val intent = Intent(this, Glossary3::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn4).setOnClickListener {
            val intent = Intent(this, Glossary4::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn5).setOnClickListener {
            val intent = Intent(this, Glossary5::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn6).setOnClickListener {
            val intent = Intent(this, Glossary6::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn13).setOnClickListener {
            val intent = Intent(this, Glossary7::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn9).setOnClickListener {
            val intent = Intent(this, Glossary8::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn13).setOnClickListener {
            val intent = Intent(this, Glossary9::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.tBtn10).setOnClickListener {
            val intent = Intent(this, Glossary10::class.java)
            startActivity(intent)
        }
    }
}

class Glossary1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia1) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia2) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia3) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia4) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia5) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary6: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia6) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary7: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia7) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary8: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia8) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary9: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia9) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}

class Glossary10: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.trivia10) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn3).setOnClickListener {
            val intent = Intent(this, Glossary::class.java)
            startActivity(intent)
        }
    }
}
