package com.example.ttwcompanionguideapp.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.data.local.AppDB

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // VERIFICAR SESION

        val sharedPref =
            getSharedPreferences(
                "Sesion",
                MODE_PRIVATE
            )

        val sesionIniciada =
            sharedPref.getBoolean(
                "sesion_iniciada",
                false
            )

        if (sesionIniciada) {

            val intent = Intent(
                this,
                FirstAppActivity::class.java
            )

            startActivity(intent)

            finish()
        }

        setContentView(R.layout.activity_login)

        val etEmail =
            findViewById<EditText>(R.id.etEmail)

        val etPassword =
            findViewById<EditText>(R.id.etPassword)

        val btnLogin =
            findViewById<Button>(R.id.btnLogin)

        val txtRegistrar =
            findViewById<TextView>(R.id.txtRegistrar)

        // ROOM DATABASE

        val db =
            Room.databaseBuilder(
                applicationContext,
                AppDB::class.java,
                "fallout_database"
            )
                .allowMainThreadQueries()
                .build()

        val usuarioDao =
            db.usuarioDao()

        btnLogin.setOnClickListener {

            val email =
                etEmail.text.toString().trim()

            val password =
                etPassword.text.toString().trim()

            if (
                email.isEmpty() ||
                password.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Completa los campos",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            val usuario =
                usuarioDao.login(
                    email,
                    password
                )

            if (usuario != null) {

                // GUARDAR SESION

                val editor =
                    sharedPref.edit()

                editor.putBoolean(
                    "sesion_iniciada",
                    true
                )

                editor.putString(
                    "email_usuario",
                    email
                )

                editor.putString(
                    "username",
                    usuario.username
                )

                editor.apply()

                Toast.makeText(
                    this,
                    "Login correcto",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(
                    this,
                    FirstAppActivity::class.java
                )

                startActivity(intent)

                finish()

            } else {

                Toast.makeText(
                    this,
                    "Credenciales incorrectas",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        txtRegistrar.setOnClickListener {

            val intent = Intent(
                this,
                Register::class.java
            )

            startActivity(intent)
        }
    }
}