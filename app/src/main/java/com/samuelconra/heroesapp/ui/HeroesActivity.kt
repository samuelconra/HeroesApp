package com.samuelconra.heroesapp.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samuelconra.heroesapp.R
import com.samuelconra.heroesapp.adapters.HeroeAdapter
import com.samuelconra.heroesapp.models.Heroe
import com.samuelconra.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    lateinit var publisherName: TextView
    lateinit var publisherDescription: TextView
    lateinit var publisherBackground: ImageView
    lateinit var heroesRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        publisherName = findViewById(R.id.publisherName)
        publisherDescription = findViewById(R.id.publisherDesc)
        publisherBackground = findViewById(R.id.publisherBackground)
        heroesRecyclerView = findViewById(R.id.heroesRecyclerView)

        val publisherID = intent.getIntExtra("publisherId", 0)
        val publisher = Publisher.publishers.firstOrNull { it.id == publisherID }
        val heroes = Heroe.heroes.filter { it.publisherId == publisherID }

        publisherName.text = publisher?.name
        val imageId = this.resources.getIdentifier(publisher?.background, "drawable", this.packageName)
        publisherBackground.setImageResource(imageId)
        publisherDescription.text = publisher?.description

        heroesRecyclerView.adapter = HeroeAdapter(heroes)
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 3)
    }
}