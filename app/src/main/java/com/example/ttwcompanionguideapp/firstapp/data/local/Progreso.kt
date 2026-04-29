package com.example.ttwcompanionguideapp.firstapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "progreso",
    primaryKeys = ["usuarioId", "companionId"]
)
data class Progreso(
    val usuarioId: Int,
    val companionId: Int,
    val descubierto: Boolean = false,
    val misionCompletada: Boolean = false
)