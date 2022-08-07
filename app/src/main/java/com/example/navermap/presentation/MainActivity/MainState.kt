package com.example.navermap.presentation.MainActivity

import androidx.annotation.StringRes
import com.example.navermap.data.entity.MapSearchInfoEntity


sealed class MainState {

    object Uninitialized : MainState()
    object Loading : MainState()

    data class Success(
        val mapSearchInfoEntity: MapSearchInfoEntity,
        val isLocationSame: Boolean,
//        val foodMenuListInBasket: List<RestaurantFoodEntity>? = null
    ) : MainState()

    data class Error(
        @StringRes val errorMessage: Int
    ) : MainState()
}