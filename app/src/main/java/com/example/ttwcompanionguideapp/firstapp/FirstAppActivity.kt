package com.example.ttwcompanionguideapp.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.fallout3.F3CompanionListActivity
import com.example.ttwcompanionguideapp.firstapp.falloutnv.FNVCompanionListActivity

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnFalloutNV = findViewById<ImageButton>(R.id.btnFalloutNV)

        btnFalloutNV.setOnClickListener {
            val intent = Intent(this, FNVCompanionListActivity::class.java)
            startActivity(intent)
        }

        val btnFallout3 = findViewById<ImageButton>(R.id.btnFallout3)

        btnFallout3.setOnClickListener {
            val intent = Intent(this, F3CompanionListActivity::class.java)
            startActivity(intent)
        }

        val txtSaludo =
            findViewById<TextView>(R.id.txtSaludo)

        val sharedPref =
            getSharedPreferences(
                "Sesion",
                MODE_PRIVATE
            )

        val username =
            sharedPref.getString(
                "username",
                "Usuario"
            )

        txtSaludo.text =
            "Hola, $username"

        val btnCerrarSesion =
            findViewById<Button>(R.id.btnCerrarSesion)

        btnCerrarSesion.setOnClickListener {

            val sharedPref =
                getSharedPreferences(
                    "Sesion",
                    MODE_PRIVATE
                )

            val editor = sharedPref.edit()

            editor.clear()

            editor.apply()

            val intent = Intent(
                this,
                Login::class.java
            )

            startActivity(intent)

            finish()
        }

    }
}