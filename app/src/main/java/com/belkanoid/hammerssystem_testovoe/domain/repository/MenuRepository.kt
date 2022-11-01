package com.belkanoid.hammerssystem_testovoe.domain.repository

import com.belkanoid.hammerssystem_testovoe.domain.entity.Food

interface MenuRepository {

    suspend fun getPayload() : Food
}