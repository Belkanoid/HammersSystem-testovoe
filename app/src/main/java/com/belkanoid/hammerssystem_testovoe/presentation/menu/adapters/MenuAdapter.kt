package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.domain.entity.Dishe
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders.MenuHolder
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.utils.MenuDiffUtilCallback

class  MenuAdapter : ListAdapter<Dishe, MenuHolder>(MenuDiffUtilCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuHolder {
        return MenuHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuHolder, position: Int) {
        holder.bind(getItem(position))
    }
}