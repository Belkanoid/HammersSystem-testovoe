package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.belkanoid.hammerssystem_testovoe.R
import com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders.TopPromoHolder

class TopPromoAdapter : RecyclerView.Adapter<TopPromoHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopPromoHolder {
        return TopPromoHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.top_promo_list_item, parent, false),
        )
    }

    override fun onBindViewHolder(holder: TopPromoHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = 4
}