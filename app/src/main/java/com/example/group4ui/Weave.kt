package com.example.group4ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Weave: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile1).setOnClickListener {
            val intent = Intent(this, Weave1::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile2).setOnClickListener {
            val intent = Intent(this, Weave4::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile3).setOnClickListener {
            val intent = Intent(this, Weave7::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile4).setOnClickListener {
            val intent = Intent(this, Weave10::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile5).setOnClickListener {
            val intent = Intent(this, Weave13::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile6).setOnClickListener {
            val intent = Intent(this, Weave4::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile7).setOnClickListener {
            val intent = Intent(this, Weave7::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.tile8).setOnClickListener {
            val intent = Intent(this, Weave10::class.java)
            startActivity(intent)
        }
    }
}

class Weave1: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving1) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, Weave2::class.java)
            startActivity(intent)
        }

        // List of all ka1 to ka9 buttons
        val kaButtons = listOf(
            R.id.ka1, R.id.ka2, R.id.ka3,
            R.id.ka4, R.id.ka5, R.id.ka6,
            R.id.ka7, R.id.ka8, R.id.ka9
        )

        // Assign same listener to all
        for (id in kaButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, Weave3::class.java)
                startActivity(intent)
            }
        }
    }
}

class Weave2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving2) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.noBtn2).setOnClickListener {
            val intent = Intent(this, Weave1::class.java)
            startActivity(intent)
        }
    }
}

class Weave3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving3) // This is where you use the XML name

        findViewById<ImageButton>(R.id.puzzleBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }
    }
}

class Weave4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving4) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, Weave5::class.java)
            startActivity(intent)
        }

        val bButtons = listOf(
            R.id.bi1, R.id.bi2, R.id.bi3,
            R.id.bi4, R.id.bi5, R.id.bi6,
            R.id.bi7, R.id.bi8, R.id.bi9
        )

        // Assign same listener to all
        for (id in bButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, Weave6::class.java)
                startActivity(intent)
            }
        }
    }
}

class Weave5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving5) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.noBtn2).setOnClickListener {
            val intent = Intent(this, Weave4::class.java)
            startActivity(intent)
        }
    }
}

class Weave6: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving6) // This is where you use the XML name

        findViewById<ImageButton>(R.id.puzzleBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }
    }
}

class Weave7: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving7) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, Weave8::class.java)
            startActivity(intent)
        }

        val tButtons = listOf(
            R.id.tis1, R.id.tis2, R.id.tis3,
            R.id.tis4, R.id.tis5, R.id.tis6,
            R.id.tis7, R.id.tis8, R.id.tis9
        )

        // Assign same listener to all
        for (id in tButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, Weave9::class.java)
                startActivity(intent)
            }
        }
    }
}

class Weave8: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving8) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.noBtn2).setOnClickListener {
            val intent = Intent(this, Weave7::class.java)
            startActivity(intent)
        }
    }
}

class Weave9: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving9) // This is where you use the XML name

        findViewById<ImageButton>(R.id.puzzleBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }
    }
}

class Weave10: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving10) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, Weave11::class.java)
            startActivity(intent)
        }

        val iButtons = listOf(
            R.id.ik1, R.id.ik2, R.id.ik3,
            R.id.ik4, R.id.ik5, R.id.ik6,
            R.id.ik7, R.id.ik8, R.id.ik9
        )

        // Assign same listener to all
        for (id in iButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, Weave12::class.java)
                startActivity(intent)
            }
        }
    }
}

class Weave11: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving11) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.noBtn2).setOnClickListener {
            val intent = Intent(this, Weave10::class.java)
            startActivity(intent)
        }
    }
}

class Weave12: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving12) // This is where you use the XML name

        findViewById<ImageButton>(R.id.puzzleBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }
    }
}

class Weave13: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving13) // This is where you use the XML name

        findViewById<ImageButton>(R.id.backBtn2).setOnClickListener {
            val intent = Intent(this, Weave14::class.java)
            startActivity(intent)
        }

        val kacButtons = listOf(
            R.id.kac1, R.id.kac2, R.id.kac3,
            R.id.kac4, R.id.kac5, R.id.kac6,
            R.id.kac7, R.id.kac8, R.id.kac9
        )

        // Assign same listener to all
        for (id in kacButtons) {
            findViewById<ImageButton>(id).setOnClickListener {
                val intent = Intent(this, Weave15::class.java)
                startActivity(intent)
            }
        }
    }
}

class Weave14: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving14) // This is where you use the XML name

        findViewById<ImageButton>(R.id.yesBtn2).setOnClickListener {
            val intent = Intent(this, MiniGames::class.java)
            startActivity(intent)
        }

        findViewById<ImageButton>(R.id.noBtn2).setOnClickListener {
            val intent = Intent(this, Weave13::class.java)
            startActivity(intent)
        }
    }
}

class Weave15: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weaving15) // This is where you use the XML name

        findViewById<ImageButton>(R.id.puzzleBtn).setOnClickListener {
            val intent = Intent(this, Weave::class.java)
            startActivity(intent)
        }
    }
}
