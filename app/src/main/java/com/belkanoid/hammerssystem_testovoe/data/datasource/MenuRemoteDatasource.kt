package com.belkanoid.hammerssystem_testovoe.data.datasource

import com.belkanoid.hammerssystem_testovoe.domain.entity.Food

interface MenuRemoteDatasource {

    suspend fun getPayload() : Food
}