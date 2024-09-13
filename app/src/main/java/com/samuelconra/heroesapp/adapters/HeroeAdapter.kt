package com.samuelconra.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.samuelconra.heroesapp.R
import com.samuelconra.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroeAdapter(val heroes: List<Heroe>): RecyclerView.Adapter<HeroeViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroe_item, parent, false)
        return HeroeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HeroeViewHolder, position: Int) {
        val publisher = heroes[position]
        holder.heroe_name.text = publisher.name
        holder.hero_year.text = publisher.year
        Picasso.get().load(publisher.image).into(holder.heroe_image)
    }

    override fun getItemCount(): Int {
        return heroes.count()
    }
}

class HeroeViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val heroe_image: ImageView = view.findViewById(R.id.heroeImage)
    val heroe_name: TextView = view.findViewById(R.id.heroeName)
    val hero_year: TextView = view.findViewById(R.id.heroeYear)
}