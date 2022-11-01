package com.belkanoid.hammerssystem_testovoe.domain.entity

import com.belkanoid.hammerssystem_testovoe.domain.entity.Category
import com.belkanoid.hammerssystem_testovoe.domain.entity.Dishe

data class OrganizationPayload(
    val categories: List<Category>,
    val dishes: List<Dishe>
)