package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.utils

import androidx.recyclerview.widget.DiffUtil
import com.belkanoid.hammerssystem_testovoe.domain.entity.Category

class CategoryDiffUtilCallback : DiffUtil.ItemCallback<Category>() {
    override fun areItemsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Category, newItem: Category): Boolean {
        return oldItem.name == newItem.name
    }
}