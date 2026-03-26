package com.example.ttwcompanionguideapp.firstapp.falloutnv.fnvcompanions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.falloutnv.FNVCompanionListActivity

class BooneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boone)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.boone)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCompanionList = findViewById<Button>(R.id.btnCompanionList)

        btnCompanionList.setOnClickListener {
            val intent = Intent(this, FNVCompanionListActivity::class.java)
            startActivity(intent)
        }
    }
}