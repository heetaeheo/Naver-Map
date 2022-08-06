package com.example.navermap.data.network

import com.example.navermap.data.repository.TmapAddress.AddressInfoResponse
import com.example.navermap.data.url.Key
import com.example.navermap.data.url.Url
import com.example.navermap.data.url.Url.GET_TMAP_REVERSE_GEO_CODE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface MapApiService {

    @GET(Url.GET_TMAP_REVERSE_GEO_CODE)
    suspend fun getReverseGeoCode(
        @Header("appKey") appKey: String = Key.TMAP_API,
        @Query("version") version: Int = 1,
        @Query("callback") callback: String? = null,
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("coordType") coordType: String? = null,
        @Query("addressType") addressType: String? = null
    ): Response<AddressInfoResponse>
}