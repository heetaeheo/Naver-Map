package com.example.navermap.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MapStudy")
data class AddressHistoryEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long?,
    val name: String,
    val lat: Double,
    val lng: Double
)