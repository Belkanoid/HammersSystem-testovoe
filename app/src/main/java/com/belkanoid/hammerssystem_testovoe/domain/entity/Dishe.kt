package com.belkanoid.hammerssystem_testovoe.domain.entity

data class Dishe(
    val id : Int,
    val description: String,
    val menu_order: Int,
    val name: String,
    val photo: Photo,
    val price: String,
    val weight: String,
    val weight_unit: String
)