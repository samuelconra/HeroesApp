package com.samuelconra.heroesapp.models

data class User(val email: String, val password: String, val name: String, val fan: String, val image: String){
    companion object{
        val staticUsers = listOf(
            User(email = "samuel@gmail.com", password = "1234", "Samuel Conde", "DC Fan", "batman_icon"),
            User(email = "profe@gmail.com", password = "Android", "Profe Juan de Dios", "Marvel Fan", "magneto_icon"),
            User(email = "diego@gmail.com", password = "1234", "Diego Gómez", "Marvel Fan", "ironman_icon"),
            User(email = "eliseo@gmail.com", password = "1234", "Eliseo Paredes", "Marvel Fan", "thor_icon"),
            User(email = "hector@gmail.com", password = "1234", "Héctor Fuper", "Marvel Fan", "flash_icon")
        )
    }
}