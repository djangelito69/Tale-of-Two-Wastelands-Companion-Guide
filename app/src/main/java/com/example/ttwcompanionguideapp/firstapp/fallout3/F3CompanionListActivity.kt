package com.example.ttwcompanionguideapp.firstapp.fallout3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.FirstAppActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.ButchActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.FawkesActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.PaladinCrossActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.CloverActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.JerichoActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.DogmeatActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.CharonActivity
import com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions.SRL3Activity

class F3CompanionListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_f3_companion_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainf3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnMenuPrincipal = findViewById<Button>(R.id.btnMenuPrincipal)

        btnMenuPrincipal.setOnClickListener {
            val intent = Intent(this, FirstAppActivity::class.java)
            startActivity(intent)
        }

        val btnButch = findViewById<ImageButton>(R.id.btnButch)

        btnButch.setOnClickListener {
            val intent = Intent(this, ButchActivity::class.java)
            startActivity(intent)
        }

        val btnCharon = findViewById<ImageButton>(R.id.btnCharon)

        btnCharon.setOnClickListener {
            val intent = Intent(this, CharonActivity::class.java)
            startActivity(intent)
        }

        val btnClover = findViewById<ImageButton>(R.id.btnClover)

        btnClover.setOnClickListener {
            val intent = Intent(this, CloverActivity::class.java)
            startActivity(intent)
        }

        val btnDogmeat = findViewById<ImageButton>(R.id.btnDogmeat)

        btnDogmeat.setOnClickListener {
            val intent = Intent(this, DogmeatActivity::class.java)
            startActivity(intent)
        }
        val btnFawkes = findViewById<ImageButton>(R.id.btnFawkes)

        btnFawkes.setOnClickListener {
            val intent = Intent(this, FawkesActivity::class.java)
            startActivity(intent)
        }

        val btnJericho = findViewById<ImageButton>(R.id.btnJericho)

        btnJericho.setOnClickListener {
            val intent = Intent(this, JerichoActivity::class.java)
            startActivity(intent)
        }

        val btnPaladinCross = findViewById<ImageButton>(R.id.btnPaladinCross)

        btnPaladinCross.setOnClickListener {
            val intent = Intent(this, PaladinCrossActivity::class.java)
            startActivity(intent)
        }

        val btnSRL3 = findViewById<ImageButton>(R.id.btnSRL3)

        btnSRL3.setOnClickListener {
            val intent = Intent(this, SRL3Activity::class.java)
            startActivity(intent)
        }
    }
}