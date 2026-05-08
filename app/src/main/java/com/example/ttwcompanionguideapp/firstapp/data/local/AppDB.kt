package com.example.ttwcompanionguideapp.firstapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Usuario::class],
    version = 1
)

abstract class AppDB : RoomDatabase() {

    abstract fun usuarioDao(): UsuarioDao

    companion object {

        @Volatile
        private var INSTANCE: AppDB? = null

        fun getDatabase(
            context: Context
        ): AppDB {

            return INSTANCE ?: synchronized(this) {

                val instance =
                    Room.databaseBuilder(
                        context.applicationContext,
                        AppDB::class.java,
                        "fallout_database"
                    )
                        .allowMainThreadQueries()
                        .build()

                INSTANCE = instance

                instance
            }
        }
    }
}