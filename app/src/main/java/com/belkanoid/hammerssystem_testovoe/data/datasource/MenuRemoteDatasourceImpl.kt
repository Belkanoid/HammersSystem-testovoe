package com.belkanoid.hammerssystem_testovoe.data.datasource

import com.belkanoid.hammerssystem_testovoe.data.network.ApiService
import com.belkanoid.hammerssystem_testovoe.domain.entity.Food
import javax.inject.Inject

class MenuRemoteDatasourceImpl @Inject constructor(
    private val apiService: ApiService
) : MenuRemoteDatasource {



    override suspend fun getPayload(): Food {
        val response = apiService.getPayload()
        if (response.isSuccessful) {
            return response.body()!!
        }
        throw RuntimeException("response unSuccessful")
    }
}