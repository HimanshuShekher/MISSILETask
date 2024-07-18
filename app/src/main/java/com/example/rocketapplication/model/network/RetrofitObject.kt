package com.example.rocketapplication.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
private const val BASE_URL="https://api.spacexdata.com/"
object RetrofitObject {
    private val  instance: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    val api: AllRocket by lazy {
        instance.create(AllRocket::class.java)
    }
}

