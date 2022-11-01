package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.domain.entity.Category

class CategoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val categoryName: TextView = itemView.findViewById(R.id.category_item_name)


    fun bind(category: Category) {
        categoryName.text = category.name
    }
}
