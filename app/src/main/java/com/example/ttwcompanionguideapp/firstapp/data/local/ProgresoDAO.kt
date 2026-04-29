package com.example.ttwcompanionguideapp.firstapp.data.local

import androidx.room.*

@Dao
interface ProgresoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun guardarProgreso(progreso: Progreso)

    @Query("SELECT * FROM progreso WHERE usuarioId = :userId")
    suspend fun obtenerProgreso(userId: Int): List<Progreso>
}