package com.example.navermap.data.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LocationLatLngEntity(
    val latitude: Double,
    val longitude: Double,
    // TODO room primary key
    val id: Long = -1,
) : Parcelable