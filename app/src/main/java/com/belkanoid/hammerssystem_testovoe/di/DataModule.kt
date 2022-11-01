package com.belkanoid.hammerssystem_testovoe.di

import com.belkanoid.hammerssystem_testovoe.data.datasource.MenuRemoteDatasource
import com.belkanoid.hammerssystem_testovoe.data.datasource.MenuRemoteDatasourceImpl
import com.belkanoid.hammerssystem_testovoe.data.network.ApiFactory
import com.belkanoid.hammerssystem_testovoe.data.network.ApiService
import com.belkanoid.hammerssystem_testovoe.data.repository.MenuRepositoryImpl
import com.belkanoid.hammerssystem_testovoe.domain.repository.MenuRepository
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideApiService() : ApiService {
        return ApiFactory.service
    }

    @Provides
    fun provideMenuRemoteDatasource(impl: MenuRemoteDatasourceImpl) : MenuRemoteDatasource {
        return impl
    }

    @Provides
    fun provideMenuRepository(impl: MenuRepositoryImpl) : MenuRepository {
        return impl
    }
}