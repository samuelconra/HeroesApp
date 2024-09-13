package com.samuelconra.heroesapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.samuelconra.heroesapp.R
import com.samuelconra.heroesapp.models.User

class MainActivity : AppCompatActivity() {
    lateinit var logInBtn: Button
    lateinit var emailEt: EditText
    lateinit var passwordEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Obtención de preferencias
        val sharedPreferences = getSharedPreferences("PREFS", Context.MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false)

        // LogIn automático
        val intent = Intent(this@MainActivity, PublisherActivity::class.java)
        if (isLoggedIn) {
            startActivity(intent)
            finish()
        }

        // Búsqueda de elementos por Id
        logInBtn = findViewById(R.id.logInBtn)
        emailEt = findViewById(R.id.emailEt)
        passwordEt = findViewById(R.id.passwordEt)

        // Acción de login Button
        logInBtn.setOnClickListener {
            val email = emailEt.text.toString()
            val password = passwordEt.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Log.i("ERROR", "Hay campos vacíos.")
                return@setOnClickListener
            }

            val isValidUser = User.staticUsers.any { user ->
                user.email == email && user.password == password}

            if (!isValidUser) {
                Log.i("ERROR", "Correo o Contraseña Inválidos")
                return@setOnClickListener
            }

            // validación de usuarios
            val user = User.staticUsers.firstOrNull{ user ->
                user.email == email && user.password == password
            }

            val editor = sharedPreferences.edit()
            editor.putBoolean("isLoggedIn", true)
            editor.putString("userEmail", user?.email)
            editor.apply()

            startActivity(intent)
            finish()
        }
    }
}