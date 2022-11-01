package com.belkanoid.hammerssystem_testovoe.data.network

import com.belkanoid.hammerssystem_testovoe.domain.entity.Food
import retrofit2.Response
import retrofit2.http.GET


interface ApiService  {

    @GET("payload.json")
    suspend fun getPayload() : Response<Food>
}