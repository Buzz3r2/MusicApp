package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.Songs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var songShow = findViewById<TextView>(R.id.songDisplayId)

        // Accessing song class with specific attributes
        var song1 = Songs("Choosin' Texas", "Ella Langley",  2026,  "3.15" )
        var song2 = Songs( "Man I Need", songArtist = "Oliva Dean", 2026, "3.15")
        var song3 = Songs( "I Just Might", songArtist = "Bruna Mars")

        songShowTxt

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}