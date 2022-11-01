package com.belkanoid.hammerssystem_testovoe.data.repository

import com.belkanoid.hammerssystem_testovoe.data.datasource.MenuRemoteDatasource
import com.belkanoid.hammerssystem_testovoe.domain.entity.Food
import com.belkanoid.hammerssystem_testovoe.domain.repository.MenuRepository
import javax.inject.Inject

class MenuRepositoryImpl @Inject constructor(
    private val menuRemoteDatasource: MenuRemoteDatasource
) : MenuRepository {
    override suspend fun getPayload(): Food {
        return menuRemoteDatasource.getPayload()
    }
}