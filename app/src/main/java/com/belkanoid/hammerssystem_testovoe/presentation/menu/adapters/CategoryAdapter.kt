package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.domain.entity.Category
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders.CategoryHolder
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.utils.CategoryDiffUtilCallback

class CategoryAdapter : ListAdapter<Category, CategoryHolder>(CategoryDiffUtilCallback())  {

    var onCategoryClickListener: ((Category) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        return CategoryHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val category = getItem(position)
        holder.bind(category)
        holder.itemView.setOnClickListener {
            onCategoryClickListener?.invoke(category)
        }
    }


}