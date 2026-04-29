package com.example.ttwcompanionguideapp.firstapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "companions")

enum class Juego {
    Fallout_3,
    Fallout_NV
}

data class Companion(
    @PrimaryKey
    val id: Int,

    val nombre: String,
    val descripcion: String,
    val juego: Juego
)
