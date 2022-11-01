package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.utils

import androidx.recyclerview.widget.DiffUtil
import com.belkanoid.hammerssystem_testovoe.domain.entity.Dishe

class MenuDiffUtilCallback : DiffUtil.ItemCallback<Dishe>() {
    override fun areItemsTheSame(oldItem: Dishe, newItem: Dishe): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Dishe, newItem: Dishe): Boolean {
        return oldItem.id == newItem.id
    }
}