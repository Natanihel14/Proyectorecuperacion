package com.example.fitflowapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.fitflowapp.models.Usuarios


@Database(
    entities = [Usuarios::class],
    version = 1,
    exportSchema = false
)
 abstract class UsuariosDatabase: RoomDatabase() {
     abstract fun usuariosDao(): UsuariosDatabaseDao
}