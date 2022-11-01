package com.belkanoid.hammerssystem_testovoe.domain.usecases

import com.belkanoid.hammerssystem_testovoe.domain.entity.Food
import com.belkanoid.hammerssystem_testovoe.domain.repository.MenuRepository
import javax.inject.Inject

class GetPayloadUseCase @Inject constructor(
    private val repository: MenuRepository
) {

    suspend operator fun invoke(): Food {
        return repository.getPayload()
    }

}