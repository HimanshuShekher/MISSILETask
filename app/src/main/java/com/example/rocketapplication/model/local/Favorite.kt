package com.example.rocketapplication.model.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "favorite")
data class Favorite(
    @PrimaryKey(autoGenerate = true)
    val id :Long,
    @ColumnInfo(name = "flight_number") val flightNumber: String?,
    @ColumnInfo(name = "mission_name") val missionName: String?
)
