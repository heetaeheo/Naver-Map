package com.example.navermap.data.repository

import com.example.navermap.data.entity.LocationEntity
import com.example.navermap.data.network.MapApiService
import com.example.navermap.di.annotation.dispatchermodule.IoDispatcher
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject
import kotlinx.coroutines.withContext

class MapApiRepositoryImpl @Inject constructor(
    private val mapApiService: MapApiService,
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) : MapApiRepository {
    override suspend fun getReverseGeoInformation(locationLatLngEntity: LocationEntity) =
        withContext(ioDispatcher) {
            val response = mapApiService.getReverseGeoCode(
                lat = locationLatLngEntity.latitude,
                lon = locationLatLngEntity.longitude
            )
            if (response.isSuccessful) {
                response.body()?.addressInfo
            } else {
                null
            }
        }
}