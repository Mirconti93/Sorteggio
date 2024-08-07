package com.mircontapp.sorteggio.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mircontapp.sportalbum.data.database.Team
import com.mircontapp.sportalbum.data.database.TeamDao

@Database(entities = [Team::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun teamDao(): TeamDao
    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context) : AppDatabase? {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "sorteggiodb.sqlite"
                    ).build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}
