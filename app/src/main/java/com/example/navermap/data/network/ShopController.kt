package com.example.navermap.data.network

import com.example.navermap.data.repository.shop.ShopInfo
import com.example.navermap.data.url.Url
import retrofit2.Response
import retrofit2.http.GET

interface ShopController {
    @GET(Url.GET_SHOP_LIST)
    suspend fun getList(): Response<ShopInfo>
}