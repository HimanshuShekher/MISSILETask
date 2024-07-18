package com.example.rocketapplication.model.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface FavoriteDao {

    @Insert
    fun insertAll(vararg users: Favorite)

    @Query("SELECT * FROM favorite")
    fun getAll(): List<Favorite>
}