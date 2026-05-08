package com.example.ttwcompanionguideapp.firstapp.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDao {

    @Insert
    fun insertarUsuario(
        usuario: Usuario
    )

    @Query("""
        SELECT * FROM usuarios
        WHERE email = :email
        AND password = :password
    """)
    fun login(
        email: String,
        password: String
    ): Usuario?
}