package com.example.ttwcompanionguideapp.firstapp.falloutnv

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
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.VeronicaActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.BooneActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.EDEActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.RaulActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.CassActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.LilyActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.RexActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions.ArcadeActivity

class FNVCompanionListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fnvcompanion_list)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainfnv)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnMenuPrincipal = findViewById<Button>(R.id.btnMenuPrincipal)

        btnMenuPrincipal.setOnClickListener {
            val intent = Intent(this, FirstAppActivity::class.java)
            startActivity(intent)
        }

        val btnVeronica = findViewById<ImageButton>(R.id.btnVeronica)

        btnVeronica.setOnClickListener {
            val intent = Intent(this, VeronicaActivity::class.java)
            startActivity(intent)
        }

        val btnBoone = findViewById<ImageButton>(R.id.btnBoone)

        btnBoone.setOnClickListener {
            val intent = Intent(this, BooneActivity::class.java)
            startActivity(intent)
        }

        val btnEDE = findViewById<ImageButton>(R.id.btnEDE)

        btnEDE.setOnClickListener {
            val intent = Intent(this, EDEActivity::class.java)
            startActivity(intent)
        }

        val btnRaul = findViewById<ImageButton>(R.id.btnRaul)

        btnRaul.setOnClickListener {
            val intent = Intent(this, RaulActivity::class.java)
            startActivity(intent)
        }
        val btnCass = findViewById<ImageButton>(R.id.btnCass)

        btnCass.setOnClickListener {
            val intent = Intent(this, CassActivity::class.java)
            startActivity(intent)
        }
        val btnLily = findViewById<ImageButton>(R.id.btnLily)

        btnLily.setOnClickListener {
            val intent = Intent(this, LilyActivity::class.java)
            startActivity(intent)
        }

        val btnRex = findViewById<ImageButton>(R.id.btnRex)

        btnRex.setOnClickListener {
            val intent = Intent(this, RexActivity::class.java)
            startActivity(intent)
        }

        val btnArcade = findViewById<ImageButton>(R.id.btnArcade)

        btnArcade.setOnClickListener {
            val intent = Intent(this, ArcadeActivity::class.java)
            startActivity(intent)
        }

    }
}