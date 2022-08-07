package com.example.navermap.data.repository

import com.example.navermap.data.entity.LocationEntity
import com.example.navermap.data.response.TmapAddress.AddressInfo

interface MapApiRepository {
    suspend fun getReverseGeoInformation(
        locationLatLngEntity: LocationEntity
    ): AddressInfo?
}