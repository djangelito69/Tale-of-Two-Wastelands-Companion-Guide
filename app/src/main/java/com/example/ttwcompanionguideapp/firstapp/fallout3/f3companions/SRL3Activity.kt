package com.example.ttwcompanionguideapp.firstapp.fallout3.f3companions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.fallout3.F3CompanionListActivity

class SRL3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_srl3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.srl3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCompanionList = findViewById<Button>(R.id.btnCompanionList)

        btnCompanionList.setOnClickListener {
            val intent = Intent(this, F3CompanionListActivity::class.java)
            startActivity(intent)
        }
    }
}