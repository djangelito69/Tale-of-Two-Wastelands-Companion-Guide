package com.example.ttwcompanionguideapp.firstapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true)
    val idUsuario: Int = 0,
    val username: String,
    val email : String,
    val password: String,
    val image: String
)