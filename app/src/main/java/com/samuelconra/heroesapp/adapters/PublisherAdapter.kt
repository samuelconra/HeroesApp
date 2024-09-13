package com.samuelconra.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.samuelconra.heroesapp.R
import com.samuelconra.heroesapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(val publishers: List<Publisher>, val onClick:(Publisher)->Unit): RecyclerView.Adapter<PublisherViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publishers[position]
        Picasso.get().load(publisher.image).into(holder.publisher_image)

        holder.itemView.setOnClickListener {
            onClick(publisher)
        }
    }

    override fun getItemCount(): Int {
        return publishers.count()
    }
}

class PublisherViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val publisher_image: ImageView = view.findViewById(R.id.publisherImage)
}