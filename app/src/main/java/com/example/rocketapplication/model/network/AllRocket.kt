package com.example.rocketapplication.model.network

import com.example.rocketapplication.model.data_class.RocketListResponse
import retrofit2.Response
import retrofit2.http.GET


interface AllRocket {
    @GET("v3/launches")
   suspend fun getAllRocket():Response<RocketListResponse>
}

