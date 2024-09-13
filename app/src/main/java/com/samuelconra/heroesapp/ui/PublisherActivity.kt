package com.samuelconra.heroesapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samuelconra.heroesapp.R
import com.samuelconra.heroesapp.adapters.PublisherAdapter
import com.samuelconra.heroesapp.models.Publisher
import com.samuelconra.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {
    // Creación de Variables
    lateinit var username: TextView
    lateinit var fanTxt: TextView
    lateinit var userImage: ImageView
    lateinit var logoutBtn: ImageView
    lateinit var publisherRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)

        // Preferencias | Obtención Email | Busqueda User por Email
        val sharedPreferences = getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("userEmail", "")
        val user = User.staticUsers.firstOrNull { it.email == userEmail }

        // Inicialización variables
        username = findViewById(R.id.usernameTxt)
        fanTxt = findViewById(R.id.fanTxt)
        userImage = findViewById(R.id.userImage)
        logoutBtn = findViewById(R.id.logOutBtn)

        // Modificación personalizada
        username.text = user?.name
        fanTxt.text = user?.fan
        val imageId = this.resources.getIdentifier(user?.image, "drawable", this.packageName)
        userImage.setImageResource(imageId)

        // Funcionalidad RecyclerView Publisher
        publisherRecyclerView = findViewById(R.id.publisherRecyclerView)
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers){ publisher ->
            val intent = Intent(this@PublisherActivity, HeroesActivity::class.java).apply {
                putExtra("publisherId", publisher.id)
            }
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Duncionalidad botón logOut
        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLoggedIn")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}