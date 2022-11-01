package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.domain.entity.Dishe
import com.bumptech.glide.Glide

class MenuHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val menuTitle : TextView = itemView.findViewById(R.id.menu_item_title)
    private val menuDescription : TextView = itemView.findViewById(R.id.menu_item_description)
    private val menuImage : ImageView = itemView.findViewById(R.id.menu_item_pic)

    fun bind(dish: Dishe) {
        menuTitle.text = dish.name
        menuDescription.text = dish.description

        val imageUrl = dish.photo.small_square

        Glide.with(itemView)
            .load(imageUrl)
            .into(menuImage)
    }

}