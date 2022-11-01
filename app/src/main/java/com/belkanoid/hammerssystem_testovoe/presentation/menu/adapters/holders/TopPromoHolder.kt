package com.belkanoid.hammerssystem_testovoe.presentation.menu.adapters.holders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.belkanoid.hammerssystem_testovoe.R
import com.bumptech.glide.Glide

class TopPromoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val promoImage :ImageView = itemView.findViewById(R.id.top_promo_image)

    fun bind() {
        Glide.with(itemView)
            .load(
                itemView.resources.getDrawable(R.drawable.img)
            )
            .into(promoImage)
    }
}