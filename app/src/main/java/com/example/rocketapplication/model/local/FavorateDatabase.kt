package com.example.rocketapplication.model.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Favorite::class], version = 1)
abstract class FavorateDatabase : RoomDatabase() {
    abstract fun userDao(): FavoriteDao
}