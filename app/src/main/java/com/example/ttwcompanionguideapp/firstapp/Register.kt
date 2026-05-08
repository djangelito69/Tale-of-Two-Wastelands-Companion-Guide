package com.example.ttwcompanionguideapp.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.example.ttwcompanionguideapp.R
import com.example.ttwcompanionguideapp.firstapp.data.local.AppDB
import com.example.ttwcompanionguideapp.firstapp.data.local.Usuario

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_register)

        val etUsername =
            findViewById<EditText>(R.id.etUsername)

        val etEmail =
            findViewById<EditText>(R.id.etEmail)

        val etPassword =
            findViewById<EditText>(R.id.etPassword)

        val btnRegistrar =
            findViewById<Button>(R.id.btnRegistrar)

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

        btnRegistrar.setOnClickListener {

            val username =
                etUsername.text.toString().trim()

            val email =
                etEmail.text.toString().trim()

            val password =
                etPassword.text.toString().trim()

            // VALIDACION

            if (
                username.isEmpty() ||
                email.isEmpty() ||
                password.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "Completa todos los campos",
                    Toast.LENGTH_SHORT
                ).show()

                return@setOnClickListener
            }

            // CREAR USUARIO

            val usuario = Usuario(
                username = username,
                email = email,
                password = password
            )

            // INSERTAR EN ROOM

            usuarioDao.insertarUsuario(usuario)

            Toast.makeText(
                this,
                "Usuario registrado",
                Toast.LENGTH_SHORT
            ).show()

            // IR A LOGIN

            val intent = Intent(
                this,
                Login::class.java
            )

            startActivity(intent)

            finish()
        }
    }
}